package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.zxc.domain.common.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 权限实体类
 *
 * @Author: hanYong
 * @CreateTime: 2019-09-25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("auth_power")
public class AuthPower extends BaseEntity implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer powerCode;
    /**
     * 权限标识
     */
    @TableId(type = IdType.AUTO)
    @ExcelProperty(value = "权限标识", index = 0)
    private String powerPerms;
    /**
     * 权限名称
     */
    @TableField(condition = SqlCondition.LIKE_RIGHT)
    @ExcelProperty(value = "权限名称", index = 1)
    private String powerName;
    /**
     * 权限类型 (M:菜单 F:功能)
     */
    @ExcelProperty(value = "权限类型", index = 2)
    private String powerType;
    /**
     * 权限状态 (E.生效 D.失效)
     */
    @ExcelProperty(value = "权限状态", index = 3)
    private String powerStatus;
    /**
     * 上级权限编号
     */
    private Integer powerParentCode;
    /**
     * 上级权限名称
     */
    @TableField(exist = false, select = false)
    @ExcelProperty(value = "上级权限名称", index = 4)
    private String powerParentName;
    /**
     * 权限地址
     */
    @ExcelProperty(value = "权限地址", index = 5)
    private String powerUrl;
    /**
     * 显示顺序
     */
    @ExcelProperty(value = "显示顺序", index = 6)
    private Integer powerDisplaySn;
    /**
     * 权限图标
     */
    private String powerIconContent;
    /**
     * 权限编号集合
     */
    @TableField(exist = false, select = false)
    private List<Integer> ids;

    public Integer getPowerCode() {
        return powerCode;
    }

    public void setPowerCode(Integer powerCode) {
        this.powerCode = powerCode;
    }

    public String getPowerPerms() {
        return powerPerms;
    }

    public void setPowerPerms(String powerPerms) {
        this.powerPerms = powerPerms;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
    }

    public Integer getPowerParentCode() {
        return powerParentCode;
    }

    public void setPowerParentCode(Integer powerParentCode) {
        this.powerParentCode = powerParentCode;
    }

    public String getPowerParentName() {
        return powerParentName;
    }

    public void setPowerParentName(String powerParentName) {
        this.powerParentName = powerParentName;
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl;
    }

    public Integer getPowerDisplaySn() {
        return powerDisplaySn;
    }

    public void setPowerDisplaySn(Integer powerDisplaySn) {
        this.powerDisplaySn = powerDisplaySn;
    }

    public String getPowerIconContent() {
        return powerIconContent;
    }

    public void setPowerIconContent(String powerIconContent) {
        this.powerIconContent = powerIconContent;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "AuthPower{" +
                "powerCode=" + powerCode +
                ", powerPerms='" + powerPerms + '\'' +
                ", powerName='" + powerName + '\'' +
                ", powerType=" + powerType +
                ", powerStatus=" + powerStatus +
                ", powerParentCode=" + powerParentCode +
                ", powerParentName='" + powerParentName + '\'' +
                ", powerUrl='" + powerUrl + '\'' +
                ", powerDisplaySn=" + powerDisplaySn +
                ", powerIconContent='" + powerIconContent + '\'' +
                ", ids=" + ids +
                '}';
    }
}