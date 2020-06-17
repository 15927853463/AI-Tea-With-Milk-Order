package com.zxc.domain;

import com.hbsc.domain.common.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author YinZhangxiao
 * @date 2019/10/10
 * @time 17:41
 */
public class AuthPowerBo extends BaseEntity implements Serializable {

    /**
     * 主键
     */
    private Integer powerCode;
    /**
     * 权限标识
     */
    private String powerPerms;
    /**
     * 权限名称
     */
    private String powerName;
    /**
     * 权限类型 (M:菜单 F:功能)
     */
    private String powerType;
    /**
     * 权限状态 (E.生效 D.失效)
     */
    private String powerStatus;
    /**
     * 上级权限编号
     */
    private Integer powerParentCode;
    /**
     * 权限地址
     */
    private String powerUrl;
    /**
     * 显示顺序
     */
    private Integer powerDisplaySn;
    /**
     * 权限图标
     */
    private String powerIconContent;
    /**
     *下级目录
     */
    private List<AuthPowerBo> childDirectory;
    /**
     * 下级菜单
     */
    private List<AuthPowerBo> childMenu;
    /**
     * 上级权限名称
     */
    private String powerParentName;
    /**
     * 上级权限类型
     */
    private String powerParentType;
    /**
     * 上级权限层级
     */
    private String powerParentLevel;

    public String getPowerParentLevel() {
        return powerParentLevel;
    }

    public void setPowerParentLevel(String powerParentLevel) {
        this.powerParentLevel = powerParentLevel;
    }

    public String getPowerParentType() {
        return powerParentType;
    }

    public void setPowerParentType(String powerParentType) {
        this.powerParentType = powerParentType;
    }

    public List<AuthPowerBo> getChildDirectory() {
        return childDirectory;
    }

    public AuthPowerBo setChildDirectory(List<AuthPowerBo> childDirectory) {
        this.childDirectory = childDirectory;
        return this;
    }

    public List<AuthPowerBo> getChildMenu() {
        return childMenu;
    }

    public AuthPowerBo setChildMenu(List<AuthPowerBo> childMenu) {
        this.childMenu = childMenu;
        return this;
    }

    public String getPowerParentName() {
        return powerParentName;
    }

    public void setPowerParentName(String powerParentName) {
        this.powerParentName = powerParentName;
    }

    public String getPowerPerms() {
        return powerPerms;
    }

    public void setPowerPerms(String powerPerms) {
        this.powerPerms = powerPerms;
    }

    public Integer getPowerCode() {
        return powerCode;
    }

    public void setPowerCode(Integer powerCode) {
        this.powerCode = powerCode;
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
}
