package com.Snigdha.Snigdha.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Snigdha.Snigdha.models.Login;

@Service
@Repository
public class LoginRepository {
    
    public Boolean Authentication(Login userLogin){
        System.out.println(userLogin.getUserName());        
        System.out.println(userLogin.getPassWord());

        if (!(userLogin.getUserName() == "admin") &&  !(userLogin.getPassWord() == "admin"))
        {
            return true;
        }
        return false;
    }
}
