package com.sam.webflux_jwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SpringDataUserDetailService implements UserDetailsService {

    //根據帳號查詢用戶資訊
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //將來連接資料庫根據帳號查詢用戶訊息
        //暫時採用模擬方式
        //登入帳號
        System.out.println("username = " + username);
        //暫時採用模擬方式
        UserDetails userDetails = User.withUsername("sam").password("000").authorities("p1").build();
//        UserDetails userDetails2 = User.withUsername("chloe").password("000").authorities("p2").build();
        return userDetails;
    }
}
