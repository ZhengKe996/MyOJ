package fun.timu.doj.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户查询请求
 *
 * @author zhengke
 * @date 2024年12月31日
 */
@Data
public class UserQueryRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 开放平台id
     */
    private String unionId;

    /**
     * 公众号openId
     */
    private String mpOpenId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}