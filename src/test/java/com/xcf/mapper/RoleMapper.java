package com.xcf.mapper;

import com.xcf.to.Role;

/*
 * @author gethin
 */
public interface RoleMapper {

    Role getRole(Long id);

    Role findRole(String roleName);

    int deleteRole(Long id);

    int insertRole(Role role);

    void initDb();
}