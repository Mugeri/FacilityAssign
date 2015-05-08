package com.facility.controllers;
import com.facility.models.Patients;
import com.facility.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by user on 5/7/2015.
 */
@Controller
public class PatientController {
    @Autowired
    PatientService patientService;

    @RequestMapping("/")
    public ModelAndView hello(){
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO THE FACILITY");
        model.setViewName("hello");
        return model;
    }
    @RequestMapping("/create")
    public ModelAndView create( @RequestParam(value="fname", required=true)String fname,
                                @RequestParam(value="lname", required=true)String lname,
                                @RequestParam(value="dob", required=true)String dob
    ){
        ModelAndView model = new ModelAndView();

        Patients patient = new Patients();
        String time = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(Calendar.getInstance().getTime());

        patient.setFirst_name(fname);
        patient.setLast_name(lname);
        patient.setDob(dob);
        patient.setTime(time);
        patientService.insertRow(patient);
        model.setViewName("hello");
        return model;
    }
    @RequestMapping("/list")
    public void list() {
        List<Patients> patientList = patientService.getList();
        for (Patients patient : patientList) {
            System.out.println(patient.getFirst_name() + " " + patient.getLast_name() + " " + patient.getDob());
        }
    }


}
