package com.yzli.carmensystem.pojo;

import java.io.Serializable;

/**
 * User
 * @author 
 */
public class Willinglist implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * passwd
     */
    private String passwd;

    /**
     * role
     */
    private String role;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}