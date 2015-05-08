package com.facility.models;


import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Created by user on 5/7/2015.
 */
@Entity
@Table(name = "drugs")
public class Drugs {

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="id");
    @Column(name="id")
     private int patientId;

    @Id
    @GeneratedValue
    @Column(name="drugid")
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
