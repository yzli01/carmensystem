package com.yzli.carmensystem.service;

import com.yzli.carmensystem.dao.WaitingtodoDao;
import com.yzli.carmensystem.dao.WillinglistDao;
import com.yzli.carmensystem.pojo.Waitingtodo;
import com.yzli.carmensystem.pojo.Willinglist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service(value = "willingManagerImp")
public class WillingManagerImp implements WillingManager{

    @Autowired
    WillinglistDao willinglistDao;
    @Autowired
    WaitingtodoDao waitingtodoDao;

    @Override
    public List<Willinglist> getWillingList(){
        return willinglistDao.selectAll();
    }

    @Override
    public int addNewWilling(String willing, Date willingTime, String willingedPerson){
        if (willing!=null) {
            Willinglist willinglist = new Willinglist();
            willinglist.setSxbz("N");
            willinglist.setWillingname(willing);
            willinglist.setTjsj(new Date());
            willinglist.setWilingt(willingTime);
            willinglist.setWillingp(willingedPerson);
            willinglistDao.insert(willinglist);

            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int getWilling(String willingPerson, String getter){
        List<Willinglist> willinglists=willinglistDao.selectByWillingPerson(willingPerson);

        for (int i = 0; i <willinglists.size() ; i++) {
            Waitingtodo waitingtodo=new Waitingtodo();
            waitingtodo.setDbry(getter);
            waitingtodo.setDbsx(willinglists.get(i).getWillingname());
            waitingtodo.setSxbz(willinglists.get(i).getSxbz());
            waitingtodo.setWillingd(willinglists.get(i).getWillingd());
            waitingtodo.setWillingt(willinglists.get(i).getWilingt());
            waitingtodoDao.insert(waitingtodo);
        }

        return 1;
    }
}
