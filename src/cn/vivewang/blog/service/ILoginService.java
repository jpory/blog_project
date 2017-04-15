package cn.vivewang.blog.service;

import cn.vivewang.blog.bean.UserBean;



public interface ILoginService {

    public UserBean Login(String username,String password);
    
    
}