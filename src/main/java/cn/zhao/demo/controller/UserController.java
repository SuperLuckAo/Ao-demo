package cn.zhao.demo.controller;

import cn.zhao.demo.entity.User;
import cn.zhao.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 示例接口：验证 MyBatis-Plus + MySQL 是否正常
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        return userMapper.selectList(null);
    }
}
