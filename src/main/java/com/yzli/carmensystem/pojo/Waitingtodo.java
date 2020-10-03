package com.yzli.carmensystem.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * WaitingToDo
 * @author 
 */
public class Waitingtodo implements Serializable {
    /**
     * id 编号
     */
    private Integer id;

    /**
     * dbsx 待办事项
     */
    private String dbsx;

    /**
     * dbry 待办人员
     */
    private String dbry;

    /**
     * sxbz 实现标志
     */
    private String sxbz;

    /**
     * willingd 实现时间
     */
    private Date willingd;

    /**
     * willingt 期望时间
     */
    private Date willingt;

    /**
     * by1 备用1
     */
    private String by1;

    /**
     * by2 备用2
     */
    private String by2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDbsx() {
        return dbsx;
    }

    public void setDbsx(String dbsx) {
        this.dbsx = dbsx;
    }

    public String getDbry() {
        return dbry;
    }

    public void setDbry(String dbry) {
        this.dbry = dbry;
    }

    public String getSxbz() {
        return sxbz;
    }

    public void setSxbz(String sxbz) {
        this.sxbz = sxbz;
    }

    public Date getWillingd() {
        return willingd;
    }

    public void setWillingd(Date willingd) {
        this.willingd = willingd;
    }

    public Date getWillingt() {
        return willingt;
    }

    public void setWillingt(Date willingt) {
        this.willingt = willingt;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }
}