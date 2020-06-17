package com.zxc.domain.common;

import com.alibaba.excel.metadata.BaseRowModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * Class Name : BaseBo.
 * Description : 查询基类，包含分页、排序等公共字段，各业务查询类继承该类即可.
 * Created by Jhony Zhang on 2016-05-06.
 */
public class BaseBo extends BaseRowModel {
    @JsonIgnore
	private String userName;
    @JsonIgnore
	private String roleName;
    /**
     * 描述: 页数
     */
    @JsonIgnore
    private Long page;
    @JsonIgnore
    private Integer from;
    @JsonIgnore
    private Long size;
    /**
     * 描述: 每页记录数
     */
    @JsonIgnore
    private Long rows;

    @JsonIgnore
    private Long limit;

    /**
     * 描述: 排序条件(排序字段)
     */
    @JsonIgnore
    private String sidx;

    /**
     * 描述: 排序方式
     */
    @JsonIgnore
    private String sord;

    /**
     * 描述: 编辑标识 0/null新增 1修改
     */
    @JsonIgnore
    private Long editFlag;

    /**
     * 描述：操作类型 add：新增 edit：编辑 view：查看 revoc:撤销
     */
    @JsonIgnore
    private String oper;

    @JsonIgnore
    private Long start;

    //1：保存，2：提交
    @JsonIgnore
    private String commitFlag;

    // 每页条数
    @JsonIgnore
    public static final Long REC_PER_PAGE = 5000L;
    // 当前页
    @JsonIgnore
    public static final Long PAGE_NO = 1L;


    @JsonIgnore
    private String backUrl;
    @JsonIgnore
    private String backParam;

    private List<String> orgCodes;
    private List<String> ids;

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getBackParam() {
        return backParam;
    }

    public void setBackParam(String backParam) {
        this.backParam = backParam;
    }

    public String getCommitFlag() {
        return commitFlag;
    }

    public void setCommitFlag(String commitFlag) {
        this.commitFlag = commitFlag;
    }

    public Long getPage() {
        // 获取页号，判断页号是否合法，如不合法设置为1
        if (this.page == null || this.page.longValue() <= PAGE_NO) {
            page = PAGE_NO;
        }
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getRows() {
        // 获取每页记录数，判断每页记录数据是否合法，如不合法设置为应用程序参数值
        if (this.rows == null || this.rows.longValue() <= 0) {
            rows = REC_PER_PAGE;
        }
        return rows;
    }

    public Long getStart(){
        if(this.page==null || this.page==1){
            this.start = 0L;
        }else if(this.page>1){
            this.start = (page-1)*rows;
        }
        return this.start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public Long getEditFlag() {
        return editFlag;
    }

    public void setEditFlag(Long editFlag) {
        this.editFlag = editFlag;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public List<String> getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(List<String> orgCodes) {
        this.orgCodes = orgCodes;
    }
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
