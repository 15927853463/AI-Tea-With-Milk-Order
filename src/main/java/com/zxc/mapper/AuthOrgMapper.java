package com.zxc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxc.domain.AuthOrg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AuthOrgMapper
 *
 * @Author：sunHuan
 * @CreateTime: 2019-09-26
 */
public interface AuthOrgMapper extends BaseMapper<AuthOrg> {
    /**
     * 根据orgCode查询组织信息
     *
     * @param orgCode
     * @return
     */
    AuthOrg selectOrgByOrgCode(Integer orgCode);

    /**
     * 根据orgCode查询生效的下级组织信息
     *
     * @param orgCode
     * @return
     */
    List<AuthOrg> selectOrgByOrgCodeAndStatus(Integer orgCode);

    /**
     * 根据orgParentCode查询失效的上级组织信息
     *
     * @param orgParentCode
     * @return
     */
    AuthOrg selectOrgByOrgParentCodeAndStatusD(Integer orgParentCode);

    /**
     * selectAuthPowerList
     * 查询权限列表
     *
     * @param authOrg
     * @return 分页数据
     */
    List<AuthOrg> selectAuthOrgList(AuthOrg authOrg);


    /**
     * 根据组织code集合查询组织名转化为一条记录
     * @param orgIds 组织code集合
     * @return 组织名(逗号隔开)
     */
    String selectAuthOrgNames(@Param("orgIds") List<String> orgIds);

    /**
     * 删除全部组织
     * @return
     */
    Integer deleteAllOrg();

    /**
     * 批量新增组织
     * @param orgList
     * @return
     */
    Integer importOrg(@Param("orgList") List orgList);

    /**
     * 根据父级组织编号查询子级组织编号
     * @param orgCodeList
     * @return
     */
    List<Integer> selectChildOrgCodeByParentCode(@Param("orgCodeList") List orgCodeList);

    /**
     * 获取所有未删除、生效的组织名称
     * @return
     */
    List<String> getAllOrgName();
}
