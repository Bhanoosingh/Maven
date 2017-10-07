package com.test.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class studentAddress implements Serializable{


    private static final long serialVersionUID = -6091579459463730482L;


    @Id
    @GeneratedValue
    private int studentAddressId;

    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @OneToOne
    private Student student;

    public int getStudentAddressId() {
        return studentAddressId;
    }

    public void setStudentAddressId(int studentAddressId) {
        this.studentAddressId = studentAddressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Student getstudent() {
        return student;
    }

    public void setstudent(Student student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "StudentAddress{" +
                "streetName='" + streetName + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

} // The End of Class;
