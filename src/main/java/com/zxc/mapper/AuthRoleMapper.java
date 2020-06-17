package com.zxc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxc.domain.AuthRoleBo;
import com.zxc.domain.AuthRolePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * 角色表Mapper接口.
 * @author ZHS
 * @date 2019/9/25.
 */
@Mapper
public interface AuthRoleMapper extends BaseMapper<AuthRolePo>{

    /**
     * 查询角色列表
     * @param authRole
     * @return
     */
    List<AuthRoleBo> selectAuthRoleList(AuthRoleBo authRole);
    /**
     * 关于删除角色
     * 根据角色编号删除角色与权限关系
     * @param roleCode
     * @return
     */
    Long deleteRoleAboutPowerByRCode(String roleCode);

    /**
     * 关于删除角色
     * 根据角色编号删除角色与用户关系
     * @param roleCode
     * @return
     */
    Long deleteRoleAboutUserByRCode(String roleCode);

    /**
     * 关于新增权限（权限树）
     * 根据角色编号新增角色与权限关系
     * @param roleCode  角色编号
     * @param powerCodeArray 权限编号数组
     * @return
     */
    Long insertRolePowers(@Param("roleCode") String roleCode, @Param("powerCodeArray") String[] powerCodeArray);

    /**
     * 关于新增数据权限（组织树）
     * 根据角色编号删除角色与组织关系
     * @param roleCode
     * @return
     */
    Long deleteRoleAboutOrgByRCode(String roleCode);

    /**
     * 关于新增数据权限（组织树）
     * 根据角色编号新增角色与权限关系
     * @param roleCode 角色编号
     * @param orgCodeArray  组织编号数组
     * @return
     */
    Long insertRoleOrgs(@Param("roleCode") String roleCode, @Param("orgCodeArray") String[] orgCodeArray);


    /**
     * 查询角色组织信息
     *
     * @param roleId
     * @return List<String>
     */
    List<Integer> selectOrgCodeListByRoleCode(String roleId);

    /**
     * 根据用户名查询所拥有的角色编号
     *
     * @param userCode 用户编号
     * @return 角色编号集合
     */
    Set<String> selectRoleCodesByUserCode(String userCode);

    /**
     * 根据用户名查询所拥有的角色名称
     *
     * @param userCode 用户编号
     * @return 角色名称(多角色逗号隔开)
     */
    String selectRoleNamesByUserCode(String userCode);

    /**
     * 获取拥有指定角色的用户数量
     *
     * @param roleCode 角色编号
     * @return Integer 用户数量
     */
    Integer selectCountByRoleCode(String roleCode);

    /**
     * 查询拥有我的审核权限的角色
     * @return 角色集合
     */
    List<AuthRolePo> queryRoleListForApproval();

    /**
     * 查询所有未删除、生效的角色名称
     * @return
     */
    List<String> selectAllRoleName();
}


