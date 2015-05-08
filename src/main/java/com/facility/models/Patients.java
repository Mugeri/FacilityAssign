package com.facility.models;

import javax.persistence.*;


/**
 * Created by user on 5/6/2015.
 */

@Entity
@Table(name ="patient")
public class Patients {

    @Id
    @GeneratedValue
    @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name="id");
    private int id;


    private String first_name;

    private String last_name;

    private String dob;

    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
