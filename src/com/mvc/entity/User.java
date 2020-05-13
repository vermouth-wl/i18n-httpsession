package com.mvc.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @Classname User
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-12 21:22
 * @Version 1.0
 **/
public class User {

    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @Range(min = 0, max = 155)
    private Integer age;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String phone;

    public User() {
    }

    public User(@NotEmpty String username, @NotEmpty String password, @NotEmpty @Range(min = 0, max = 155) Integer age, @NotEmpty @Email String email, @NotEmpty String phone) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
