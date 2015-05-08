package com.facility.controllers;

import com.facility.models.Drugs;
import com.facility.models.Patients;
import com.facility.services.DrugService;
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
public class DrugController {
    @Autowired
    DrugService drugService;
    Patients patients;
    PatientService patientService;

    @RequestMapping("/view")
    public ModelAndView hello2(){
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO PATIENT MODULE");
        model.setViewName("hello2");
        return model;
    }
    @RequestMapping("/createDrug")
    public ModelAndView create( @RequestParam(value="name", required=true)String name,
                                @RequestParam(value="id", required=true)int id
    ){
        ModelAndView model = new ModelAndView();

        Drugs drugs = new Drugs();
        drugs.setName(name);
        drugs.setPatientId(id);

        drugService.insertRow(drugs);
        model.setViewName("hello2");
        return model;
    }
    @RequestMapping("/viewPatientAndDrug")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Drugs> drugsList = drugService.getList();
        for (Drugs drugs : drugsList) {

            int drugsPatientId=drugs.getPatientId();
//                patientService.getPatientById(drugsPatientId);
//
//                Patients patients = new Patients();
//                System.out.println(patients.getFirst_name() + " " + patients.getLast_name() + " " + patients.getDob() + "" + drugs.getName() + " " + drugs.getId());
                System.out.println(drugs.getName() + " " + drugs.getId());

        }
        modelAndView.addObject("msg", drugService.getList());
        modelAndView.setViewName("viewDrug");
        return modelAndView;
    }

}
