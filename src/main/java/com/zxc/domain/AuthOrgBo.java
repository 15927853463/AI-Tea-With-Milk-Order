package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.hbsc.domain.common.BaseEntity;

import java.io.Serializable;

public class AuthOrgBo extends BaseEntity implements Serializable {

    /**
     * 组织编号
     */
    @ExcelProperty(value = "组织编号", index = 0)
    private Integer orgCode;

    /**
     * 组织名称
     */
    @ExcelProperty(value = "组织简称", index = 1)
    private String orgName;

    /**
     * 组织全称
     */
    @ExcelProperty(value = "组织全称", index = 2)
    private String orgFullName;

    /**
     * 上级组织编号
     */
    @ExcelProperty(value = "上级组织编号",index = 3)
    private Integer orgParentCode;

    /**
     * 显示顺序
     */
    @ExcelProperty(value = "显示顺序", index = 4)
    private Integer orgDisplaySn;

    /**
     * 组织状态 (E.生效 D.失效)
     */
    @ExcelProperty(value = "组织状态", index = 5)
    private String orgStatus;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注",index = 6)
    private String remark;

    /**
     * 数据来源系统 (SYS.质检系统)
     */
    private String orgSource;

    public Integer getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(Integer orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgFullName() {
        return orgFullName;
    }

    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName;
    }

    public String getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Integer getOrgParentCode() {
        return orgParentCode;
    }

    public void setOrgParentCode(Integer orgParentCode) {
        this.orgParentCode = orgParentCode;
    }

    public Integer getOrgDisplaySn() {
        return orgDisplaySn;
    }

    public void setOrgDisplaySn(Integer orgDisplaySn) {
        this.orgDisplaySn = orgDisplaySn;
    }

    public String getOrgSource() {
        return orgSource;
    }

    public void setOrgSource(String orgSource) {
        this.orgSource = orgSource;
    }
}
