package com.boot.star.mapper;

import com.boot.star.model.SysRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMapper {

   SysRole selectRoleById(int id);

   SysRole selectRole();

}