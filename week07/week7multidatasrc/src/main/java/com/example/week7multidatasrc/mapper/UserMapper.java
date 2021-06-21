package com.example.week7multidatasrc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.week7multidatasrc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> list();
}
