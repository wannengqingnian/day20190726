package com.czxy.score.dao;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface MettingMapper extends Mapper<User> {
    @Select("select * from tab_metting where username=#{username}")
    Metting findByUsername(@Param("username")String username);
}
