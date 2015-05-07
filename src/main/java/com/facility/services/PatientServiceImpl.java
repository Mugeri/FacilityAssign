package com.facility.services;


import com.facility.dao.Patientdao;
import com.facility.models.Patients;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 5/6/2015.
 */
public class PatientServiceImpl implements PatientService{
@Autowired
    Patientdao patientdao;
    @Override
    public int insertRow(Patients patients) {
        return patientdao.insertRow(patients);
    }

    @Override
    public List<Patients> getList() {
        return patientdao.getList();
    }
    @Override
    public int updateRow(Patients patients) {
        return patientdao.updateRow(patients);
    }

    @Override
    public int deleteRow(int id) {
        return patientdao.deleteRow(id);
    }
}
