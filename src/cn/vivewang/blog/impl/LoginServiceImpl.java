package cn.vivewang.blog.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.vivewang.blog.bean.UserBean;
import cn.vivewang.blog.mapper.UserMapper;
import cn.vivewang.blog.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{
    
    @Resource
    private UserMapper um;


    @Override
    public UserBean Login(String username, String password) {
        return um.login(username, password);
    }

}