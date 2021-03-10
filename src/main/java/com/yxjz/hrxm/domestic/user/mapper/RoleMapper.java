package com.yxjz.hrxm.domestic.user.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    @Select("SELECT * FROM role WHERE roleid = #{roleid}")
    RoleMapper selectById(Integer roleid);
}