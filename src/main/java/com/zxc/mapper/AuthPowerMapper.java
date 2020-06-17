package com.zxc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxc.domain.AuthPower;
import com.zxc.domain.AuthPowerBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * AuthPowerMapper
 *
 * @Author: hanYong
 * @CreateTime: 2019-09-25
 */
public interface AuthPowerMapper extends BaseMapper<AuthPower> {

    /**
     * 角色对应的权限信息
     *
     * @param roleCode
     * @return
     */
    List<AuthPower> getPowerByRoleCode(String roleCode);

    /**
     * 根据所拥有的角色查询权限标识
     *
     * @param roleCodes 角色编号集合
     * @return 权限标识集合
     */
    Set<String> selectPowerCodesByRoleCodes(@Param("roleCodes") Set<String> roleCodes);

    /**
     * 根据id查询权限(包含父级信息和当前权限层级是否是第一级)
     * @param id 主键
     * @return 权限信息
     */
    AuthPowerBo getAuthPowerById(String id);

    /**
     * selectAuthPowerList
     * 查询权限列表
     *
     * @param authPower
     * @return 分页数据
     */
    List<AuthPower> selectAuthPowerList(AuthPower authPower);

    /**
     * selectParentPowerCount
     *  查询失效的上级权限数量
     * @param id 主键
     * @return 失效的上级权限数量
     */
    Integer selectParentPowerCount(String id);
}
