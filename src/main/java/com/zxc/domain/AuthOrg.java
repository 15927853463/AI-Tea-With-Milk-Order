package com.zxc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hbsc.domain.common.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 组织实体类
 *
 * @Author: hanYong
 * @CreateTime: 2019-09-25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)//序列化忽略为null的值
@TableName("auth_org")//数据库对应的表名
public class AuthOrg extends BaseEntity implements Serializable {
    /**
     * 组织编号
     */
    @TableId(type = IdType.AUTO)//设置主键自增
    @ExcelProperty(value = "组织编号", index = 0)
    private Integer orgCode;
    /**
     * 组织名称
     */
    @TableField(condition = SqlCondition.LIKE_RIGHT)//设置该字段可模糊搜索
    @ExcelProperty(value = "组织简称", index = 1)
    private String orgName;
    /**
     * 组织全称
     */
    @TableField(condition = SqlCondition.LIKE_RIGHT)
    @ExcelProperty(value = "组织全称", index = 2)
    private String orgFullName;
    /**
     * 组织状态 (E.生效 D.失效)
     */
    @ExcelProperty(value = "组织状态", index = 3)
    private String orgStatus;
    /**
     * 上级组织编号
     */
    private Integer orgParentCode;

    /**
     * 上级组织名称
     */
    @TableField(exist = false, select = false)//设置该字段不存在数据库，也不需要做为查询项
    @ExcelProperty(value = "上级组织简称", index = 4)
    private String orgParentName;
    /**
     * 显示顺序
     */
    @ExcelProperty(value = "显示顺序", index = 5)
    private Integer orgDisplaySn;
    /**
     * 数据来源系统对应ID
     */
    @ExcelProperty(value = "数据来源系统对应ID", index = 6)
    private Integer orgSourceId;
    /**
     * 数据来源系统 (SYS.质检系统)
     */
    @ExcelProperty(value = "数据来源系统", index = 7)
    private String orgSource;

    @TableField(exist = false)
    private Map<String, Object> font;

    /**
     * 组织编号集合
     */
    @TableField(exist = false, select = false)
    private List<Integer> ids;

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

    public String getOrgParentName() {
        return orgParentName;
    }

    public void setOrgParentName(String orgParentName) {
        this.orgParentName = orgParentName;
    }

    public Integer getOrgDisplaySn() {
        return orgDisplaySn;
    }

    public void setOrgDisplaySn(Integer orgDisplaySn) {
        this.orgDisplaySn = orgDisplaySn;
    }

    public Integer getOrgSourceId() {
        return orgSourceId;
    }

    public void setOrgSourceId(Integer orgSourceId) {
        this.orgSourceId = orgSourceId;
    }

    public String getOrgSource() {
        return orgSource;
    }

    public void setOrgSource(String orgSource) {
        this.orgSource = orgSource;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Map<String, Object> getFont() {
        return font;
    }

    public void setFont(Map<String, Object> font) {
        this.font = font;
    }
}