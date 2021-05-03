package Entities;


import Abstract.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements Entity {

    public int id;
    public String firstName;
    public String lastName;
    public int yearOfBirth;
    public String nationalityId;
    
    public Customer(int id,String firstName,String lastName,int yearOfBirth,String nationalityId) {
    	this.id=id;
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.yearOfBirth=yearOfBirth;
    	this.nationalityId=nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}