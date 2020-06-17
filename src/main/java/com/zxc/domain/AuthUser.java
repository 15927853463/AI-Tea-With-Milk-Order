package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hbsc.domain.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 用户实体类
 *
 * @Author: hanYong
 * @CreateTime: 2019-09-25
 */
@TableName("auth_user")
public class AuthUser extends BaseEntity implements Serializable {
    /**
     * 用户编号
     */
    @TableId(type = IdType.AUTO)
    private Integer userCode;
    /**
     * 用户工号
     */
    @ExcelProperty(value = "用户名", index = 0)
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户真实姓名
     */
    @TableField(condition = SqlCondition.LIKE_RIGHT)
    @ExcelProperty(value = "姓名", index = 1)
    private String userRealName;
    /**
     * 所属组织编号
     */
    private String orgCode;
    /**
     * 所属组织
     */
    @ExcelProperty(value = "所属组织", index = 2)
    private String orgName;
    /**
     * 用户邮箱
     */
    @ExcelProperty(value = "邮箱", index = 5)
    private String userEmail;
    /**
     * 用户状态 (E.生效 D.失效 F.冻结 L.离职)
     */
    @ExcelProperty(value = "状态", index =4)
    private String userStatus;
    /**
     * 最后登录IP
     */
    private String lastLoginIp;
    /**
     * 最后登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "最后登录时间", index = 7)
    private Date lastLoginTime;
    /**
     * 创建时间起
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private String createdTimeStart;
    /**
     * 创建时间止
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private String createdTimeEnd;
    /**
     * 角色编号
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private String roleCode;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 用户编号集合
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private List<Integer> ids;

    /**
     * 角色编号集合
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private Set<String> roleCodes;

    /**
     * 权限编号集合
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private Set<String> powerCodes;

    /**
     * 数据权限集合
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    private Set<String> orgCodes;

    /**
     * 权限标识
     */
    @TableField(exist = false)
    @JsonIgnore
    private List<String> powerPerms;

    @TableField(exist = false, select = false)
    @ExcelProperty(value = "角色", index = 3)
    private String roleNames;

    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "创建时间", index = 8)
    private Date createdTime;

    /**
     * 备注
     */
    @TableField(exist = false, select = false)
    @JsonIgnore
    @ExcelProperty(value = "备注", index = 6)
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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
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

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getCreatedTimeStart() {
        return createdTimeStart;
    }

    public void setCreatedTimeStart(String createdTimeStart) {
        this.createdTimeStart = createdTimeStart;
    }

    public String getCreatedTimeEnd() {
        return createdTimeEnd;
    }

    public void setCreatedTimeEnd(String createdTimeEnd) {
        this.createdTimeEnd = createdTimeEnd;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Set<String> getRoleCodes() {
        return roleCodes;
    }

    public AuthUser setRoleCodes(Set<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }

    public Set<String> getPowerCodes() {
        return powerCodes;
    }

    public AuthUser setPowerCodes(Set<String> powerCodes) {
        this.powerCodes = powerCodes;
        return this;
    }

    public Set<String> getOrgCodes() {
        return orgCodes;
    }

    public AuthUser setOrgCodes(Set<String> orgCodes) {
        this.orgCodes = orgCodes;
        return this;
    }

    public List<String> getPowerPerms() {
        return powerPerms;
    }

    public void setPowerPerms(List<String> powerPerms) {
        this.powerPerms = powerPerms;
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }
}