package com.facility.dao;
import com.facility.models.Patients;
import java.util.List;

/**
 * Created by user on 5/6/2015.
 */
public interface Patientdao {


    public int insertRow(Patients patients);

    public Patients getEmployeeById(int id);

    public List<Patients> getList();

    public int updateRow(Patients patients);

    public int deleteRow(int id);
}

