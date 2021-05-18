package com.luckywowhat.lwhwebapp.service;

import com.luckywowhat.lwhwebapp.entity.User;
import com.luckywowhat.lwhwebapp.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    public void save(CrmUser crmUser);
}
