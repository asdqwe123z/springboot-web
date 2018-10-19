package com.baizhi.entity;

/**
 * Created by jia on 2018/10/17.
 */
public class User {
    private int user_id;
    private String username;
    private String pwd;
    private int sex;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User() {

    }

    public User(int user_id, String username, String pwd, int sex) {

        this.user_id = user_id;
        this.username = username;
        this.pwd = pwd;
        this.sex = sex;
    }
}
