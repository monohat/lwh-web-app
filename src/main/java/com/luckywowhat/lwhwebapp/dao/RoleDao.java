package com.luckywowhat.lwhwebapp.dao;

import com.luckywowhat.lwhwebapp.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);

}
