package com.example.user.service;

import com.example.user.UserInfo;
import com.example.user.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public List<UserInfo> list(String nameKeyword) {
        if (StringUtils.hasText(nameKeyword)) {
            return userInfoMapper.findByNameLike(nameKeyword.trim());
        }
        return userInfoMapper.findAll();
    }

    public UserInfo getById(Integer id) {
        return userInfoMapper.findById(id);
    }

    public UserInfo create(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
        return userInfo;
    }

    public UserInfo update(Integer id, UserInfo userInfo) {
        userInfo.setId(id);
        userInfoMapper.update(userInfo);
        return userInfoMapper.findById(id);
    }

    public void delete(Integer id) {
        userInfoMapper.delete(id);
    }
}

