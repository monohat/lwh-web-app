package com.luckywowhat.lwhwebapp.dao;

import com.luckywowhat.lwhwebapp.entity.User;

public interface UserDao {

    public User findByUserName(String userName);

    public void save(User user);

}
