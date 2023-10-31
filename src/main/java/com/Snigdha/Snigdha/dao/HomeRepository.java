package com.Snigdha.Snigdha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createDatabase(){
        String sql_query = "CREATE DATABASE IF NOT EXISTS Snigdha";
        jdbcTemplate.update(sql_query);
    }

}
