package com.example.user.controller;

import com.example.user.UserInfo;
import com.example.user.service.UserInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.StringUtils;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    /**
     * 用户列表 + 按名称搜索
     */
    @GetMapping
    public ResponseEntity<List<UserInfo>> list(@RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.ok(userInfoService.list(name));
    }

    /**
     * 根据 ID 查询单个
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserInfo> get(@PathVariable("id") Integer id) {
        UserInfo userInfo = userInfoService.getById(id);
        if (userInfo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userInfo);
    }

    /**
     * 新增用户
     */
    @PostMapping
    public ResponseEntity<UserInfo> create(@RequestBody UserInfo userInfo) {
        if (userInfo == null || !StringUtils.hasText(userInfo.getName()) || !StringUtils.hasText(userInfo.getAddress())) {
            return ResponseEntity.badRequest().build();
        }
        UserInfo created = userInfoService.create(userInfo);
        return ResponseEntity.ok(created);
    }

    /**
     * 修改用户
     */
    @PutMapping("/{id}")
    public ResponseEntity<UserInfo> update(@PathVariable("id") Integer id, @RequestBody UserInfo userInfo) {
        if (userInfo == null || !StringUtils.hasText(userInfo.getName()) || !StringUtils.hasText(userInfo.getAddress())) {
            return ResponseEntity.badRequest().build();
        }
        UserInfo updated = userInfoService.update(id, userInfo);
        return ResponseEntity.ok(updated);
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        userInfoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

