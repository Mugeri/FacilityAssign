package com.facility.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user Olive on 5/6/2015.
 */
@Controller
public class Patients {
    @Autowired
    PatientService patientService;
    @RequestMapping("/index")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/create")
    public ModelAndView create( @RequestParam(value="fname", required=true)String fname,
                        @RequestParam(value="lname", required=true)String lname,
                        @RequestParam(value="dob", required=true)String dob){
        ModelAndView model = new ModelAndView();

        Patients patient = new Patients();

        patient.setfirst_name(fname);
        patient.setlast_name(lname);
        patient.setdob(dob);

        patientService.insertRow(patient);

        model.setViewName("hello");
        return model;
        }


}
