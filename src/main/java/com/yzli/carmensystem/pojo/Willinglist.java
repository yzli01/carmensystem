package com.yzli.carmensystem.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * WillingList
 * @author 
 */
public class Willinglist implements Serializable {
    /**
     * id 编号
     */
    private Integer id;

    /**
     * willingp 愿望提交人
     */
    private String willingp;

    /**
     * willingt 期望实现时间
     */
    private Date wilingt;

    /**
     * willingg 愿望领取人
     */
    private String willingg;

    /**
     * willingd 愿望实现时间
     */
    private Date willingd;

    /**
     * tjsj 提交日期
     */
    private Date tjsj;

    /**
     * sxbz 实现标志
     */
    private String sxbz;

    private String willingname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWillingp() {
        return willingp;
    }

    public void setWillingp(String willingp) {
        this.willingp = willingp;
    }

    public Date getWilingt() {
        return wilingt;
    }

    public void setWilingt(Date wilingt) {
        this.wilingt = wilingt;
    }

    public String getWillingg() {
        return willingg;
    }

    public void setWillingg(String willingg) {
        this.willingg = willingg;
    }

    public Date getWillingd() {
        return willingd;
    }

    public void setWillingd(Date willingd) {
        this.willingd = willingd;
    }

    public Date getTjsj() {
        return tjsj;
    }

    public void setTjsj(Date tjsj) {
        this.tjsj = tjsj;
    }

    public String getSxbz() {
        return sxbz;
    }

    public void setSxbz(String sxbz) {
        this.sxbz = sxbz;
    }

    public String getWillingname() {
        return willingname;
    }

    public void setWillingname(String willingname) {
        this.willingname = willingname;
    }
}