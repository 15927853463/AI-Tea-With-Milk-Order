package com.zxc.domain;

import java.io.Serializable;

/**
 *
 * @Author: ZHS
 * @CreateTime: 2019-10-17
 */
public class AuthRoleBo extends AuthRolePo implements Serializable {

    /**
     * 角色编号
     */
    private String[] orgCodes;

    public String[] getOrgCodes() {
        return orgCodes;
    }

    public void setOrgCodes(String[] orgCodes) {
        if(orgCodes != null && orgCodes.length == 0){
            orgCodes = null;
        }
        this.orgCodes = orgCodes;
    }

}