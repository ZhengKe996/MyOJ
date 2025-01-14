export const LogoPath = "/src/assets/dog.svg";

export enum LayoutMenu {
  BasicLayout = "BasicLayout",
  UserLayout = "UserLayout",
}

export interface UserInterface {
  id?: string;
  userName: string;
  userAvatar: string;
  userRole: string;
  userProfile: string;
}

// Questions
import {
  type QuestionInterface,
  QuestionAdminTableColumns,
  QuestionTableColumns,
  JudgeCaseItemInfo,
  DefaultLanguage,
  type QuestionSolutionInterface,
} from "./question";

export {
  QuestionAdminTableColumns,
  QuestionTableColumns,
  JudgeCaseItemInfo,
  DefaultLanguage,
  type QuestionInterface,
  type QuestionSolutionInterface,
};
