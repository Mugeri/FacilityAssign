package com.facility.dao;

import com.facility.models.Drugs;

import java.util.List;

/**
 * Created by user on 5/7/2015.
 */
public interface Drugdao {

     int insertRow(Drugs drugs);

     List<Drugs> getList();


}
