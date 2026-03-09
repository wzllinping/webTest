package com.example.user.mapper;

import com.example.user.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("SELECT id, name, address FROM user_info ORDER BY id DESC")
    List<UserInfo> findAll();

    @Select("SELECT id, name, address FROM user_info WHERE id = #{id}")
    UserInfo findById(@Param("id") Integer id);

    @Select("SELECT id, name, address FROM user_info WHERE name LIKE CONCAT('%', #{name}, '%') ORDER BY id DESC")
    List<UserInfo> findByNameLike(@Param("name") String name);

    @Insert("INSERT INTO user_info(name, address) VALUES(#{name}, #{address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(UserInfo userInfo);

    @Update("UPDATE user_info SET name = #{name}, address = #{address} WHERE id = #{id}")
    int update(UserInfo userInfo);

    @Delete("DELETE FROM user_info WHERE id = #{id}")
    int delete(@Param("id") Integer id);
}

