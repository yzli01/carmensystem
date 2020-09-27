package com.yzli.carmensystem.pojo;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * r_name
     */
    private String rName;

    /**
     * role
     */
    private String role;

    /**
     * page
     */
    private String page;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    private static final long serialVersionUID = 1L;
}