package com.zxc.domain.common;

import com.github.pagehelper.PageSerializable;

import java.util.List;

/**
 * PageInfo
 *
 * @Author: hanYong
 * @CreateTime: 2019-10-12
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PageInfo<T> extends PageSerializable<T> {

    private int pageNum;//第几页
    private int pageSize;//每页显示多少行
    private static final long serialVersionUID = 1L;
    private int pages;

    public PageInfo(int pageNum, int pageSize, long total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        super.setTotal(total);
        super.list = list;
    }

    public PageInfo() {
    }

    public PageInfo(List<T> list) {
        super(list);
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
