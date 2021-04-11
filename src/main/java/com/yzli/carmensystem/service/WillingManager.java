package com.yzli.carmensystem.service;

import com.yzli.carmensystem.pojo.Willinglist;

import java.util.Date;
import java.util.List;

public interface WillingManager {
    public List<Willinglist> getWillingList();

    public int addNewWilling(String willing, Date willingTime, String willingedPerson);

    public int getWilling(String willingPerson,String getter);
}
