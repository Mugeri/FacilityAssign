package com.facility.services;

import com.facility.models.Drugs;
import com.facility.models.Patients;

import java.util.List;

/**
 * Created by user on 5/7/2015.
 */
public interface DrugService {
    public int insertRow(Drugs drugs);

    public List<Drugs> getList();



}
