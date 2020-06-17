package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hbsc.domain.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色实体类
 *
 * @Author: hanYong
 * @CreateTime: 2019-09-25
 */
@TableName("auth_role")
public class AuthRolePo extends BaseEntity implements Serializable {

    /**
     * 角色编号(主键)
     */
    @TableId(type = IdType.AUTO)
    private Integer roleCode;
    /**
     * 角色名称
     */
    @TableField(condition = SqlCondition.LIKE)
    @ExcelProperty(value = "角色名称", index = 0)
    private String roleName;
    /**
     * 角色状态 (E.生效 D.失效)
     */
    @ExcelProperty(value = "角色状态", index = 1)
    private String roleStatus;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    @ExcelProperty(value = "创建人", index = 2)
    private String createdBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "创建时间", index = 3)
    private Date createdTime;
    /**
     * 更新人
     */
    @TableField(fill = FieldFill.UPDATE)
    @ExcelProperty(value = "更新人", index = 4)
    private String updatedBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "更新时间", index = 5)
    private Date updatedTime;

    /**
     * 角色编号集合
     */
    @JsonIgnore
    @TableField(exist = false,select = false)
    private List<Integer> roleCodes;

    public List<Integer> getRoleCodes() {
        return roleCodes;
    }

    public void setRoleCodes(List<Integer> roleCodes) {
        this.roleCodes = roleCodes;
    }

    public Integer getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Integer roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

}