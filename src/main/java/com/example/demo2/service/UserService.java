package com.example.demo2.service;

import org.springframework.stereotype.Service;

import com.example.demo2.domein.User;

@Service
public class UserService {
    public User save(User user){
        
        // ・引数で受け取ったUser情報をusersテーブルにインサート
        // ・hobbyテーブルにインサート
        // ・メール送信

    

        System.out.println("UserServiceのsaveメソッドが呼ばれました");
        return user;

    }
}
