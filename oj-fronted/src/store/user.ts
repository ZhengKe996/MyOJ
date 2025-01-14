import { defineStore } from "pinia";
// Link:https://pinia.vuejs.org/zh/
import { ACCESSENUM, NOLOGIN } from "@/access";
import { GetLoginInfoUser } from "@/services/user";
interface UserInfo {
  userName: string;
  userRole: ACCESSENUM;
}
interface State {
  loginInfo: UserInfo;
}

export const useUserStore = defineStore("user", {
  state: (): State => ({
    loginInfo: { userName: NOLOGIN, userRole: ACCESSENUM.NOLOGIN },
  }),
  getters: {
    getUserName(): string {
      return this.loginInfo.userName;
    },
    getUserRole(): ACCESSENUM {
      return this.loginInfo.userRole;
    },
    getLoginInfo(): UserInfo {
      return this.loginInfo;
    },
  },
  actions: {
    async setUserName(username: string) {
      this.loginInfo.userName = username;
    },
    async setLoginInfo() {
      // TODO 获取用户信息
      const { code, data } = await GetLoginInfoUser();
      if (code === 0 && data) {
        this.loginInfo.userName = data.userName as string;
        this.loginInfo.userRole = data.userRole as ACCESSENUM;
      } else {
        this.loginInfo.userName = NOLOGIN;
        this.loginInfo.userRole = ACCESSENUM.NOLOGIN;
      }
    },
  },
  persist: {
    key: "user",
    storage: sessionStorage,
  },
});
