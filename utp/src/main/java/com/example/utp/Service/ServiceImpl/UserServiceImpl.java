package com.example.utp.Service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utp.Entity.User;
import com.example.utp.Mapper.UserMapper;
import com.example.utp.Service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
