package com.zxc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxc.domain.AuthPowerBo;
import com.zxc.domain.AuthRolePo;
import com.zxc.domain.AuthUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface AuthUserMapper extends BaseMapper<AuthUser> {

    /**
     * 根据用户名获取用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    AuthUser selectAuthUserByUserName(String userName);

    /**
     * 根据用户名查询菜单目录
     * @param userName 用户名
     * @return 权限菜单目录列表
     */
    List<AuthPowerBo> selectAuthPowerByUserName(@Param(value = "userName") String userName);

    /**
     * 通过用户名 查询工作台显示权限
     * @return 权限菜单目录列表
     */
    List<AuthPowerBo> selectAuthPowerByUserNameAndPerms(Map<String, Object> param);

    /**
     * 批量新增用户角色关系
     * @param
     * @return
     */
    Long insertUserRole(@Param("userCode") Integer userCode, @Param("roleCodeList") List<String> roleCodeList);

    /**
     * 通过userCode查询所拥有的角色信息
     * @param userCode
     * @return
     */
    List<AuthRolePo> selectRoleByUserCode(String userCode);

    /**
     * 根据userCode删除用户角色关系
     * @param userCode
     * @return
     */
    Long removeRoleCodeAndUserCode(String userCode);

    /**
     * 查询用户数据权限
     * @param userCode
     * @return
     */
    List<String> selectOrgCodeListByUserCode(String userCode);

    /**
     * 根据用户编号删除用户与组织关系
     * @param userCode
     * @return
     */
    Long removeOrgCodeAndUserCode(String userCode);

    /**
     * 批量新增用户数据权限(用户维度)
     * @param userCode 用户编号
     * @param orgCodes 组织编号集合
     * @return
     */
    Long insertUserOrg(@Param("userCode") String userCode, @Param("orgCodes") List<String> orgCodes);

    List<AuthUser> selectAuthUserList(AuthUser authUser);

    Long deleteNonImportedUsers(@Param("dateStart") String dateStart, @Param("dateEnd") String dateEnd);

    List<String> getOrgCodeListByUserCode(String userCode);

    /**
     * 查询拥有权限的用户
     * @param authUser
     * @return
     */
    List<AuthUser> selectHasPowerUser(AuthUser authUser);
}
