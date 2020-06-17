package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.hbsc.domain.common.BaseEntity;

import java.io.Serializable;

public class AuthUserBo extends BaseEntity implements Serializable {

    /**
     * 用户编号
     */
    @ExcelProperty(value = "用户编号",index = 0)
    private Integer userCode;
    /**
     * 用户工号
     */
    @ExcelProperty(value = "登录名", index = 1)
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户真实姓名
     */
    @ExcelProperty(value = "用户姓名", index = 2)
    private String userRealName;
    /**
     * 所属组织
     */
    @ExcelProperty(value = "所属组织", index = 3)
    private String orgName;
    /**
     * 角色姓名
     */
    @ExcelProperty(value = "角色",index = 4)
    private String roleName;
    /**
     * 用户状态 (E.生效 D.失效 F.冻结 L.离职)
     */
    @ExcelProperty(value = "用户状态", index = 5)
    private String userStatus;
    /**
     * 用户邮箱
     */
    @ExcelProperty(value = "用户邮箱", index = 6)
    private String userEmail;
    /**
     * 备注
     */
    @ExcelProperty(value = "备注",index = 7)
    private String remark;

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
