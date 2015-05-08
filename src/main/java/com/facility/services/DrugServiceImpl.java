package com.facility.services;

import com.facility.dao.Drugdao;
import com.facility.models.Drugs;
import com.facility.models.Patients;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created by user on 5/7/2015.
 */
public class DrugServiceImpl implements DrugService{
@Autowired
    Drugdao drugdao;
    @Override
    public int insertRow(Drugs drugs) {
        return drugdao.insertRow(drugs);
    }

    @Override
    public List<Drugs> getList() {
        return drugdao.getList();
    }

   }
