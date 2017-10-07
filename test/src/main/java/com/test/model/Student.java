package com.test.model;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student implements Serializable
{

    private static final long serialVersionUID = 5140900014886997914L;
    @Id
    @GeneratedValue
    private int studentId;
    @NotEmpty (message = "The student name must not be null")
    private String studentName;
    @NotEmpty (message = "The student email must not be null")
    private String studentEmail;
    private String studentPhone;
    @NotEmpty (message = "The student username must not be null")
    private String username;
    @NotEmpty (message = "The student password must not be null")
    private String password;
    private boolean enabled;
    @OneToOne
    @JoinColumn(name = "studentAddressId")
    private studentAddress studentAddress;    
    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

    public int getstudentId() {
        return studentId;
    }
    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getstudentName() {
        return studentName;
    }
    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getstudentEmail() {
        return studentEmail;
    }
    public void setstudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getstudentPhone() {
        return studentPhone;
    }
    public void setstudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public studentAddress getstudentAddress() {
        return studentAddress;
    }
    public void setstudentAddress(studentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
} // The End of Class;
