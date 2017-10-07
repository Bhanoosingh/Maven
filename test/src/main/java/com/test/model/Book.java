package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.xml.FieldType;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unused")
@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = -3532377236419382983L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @NotEmpty(message = "The book name must not be empty")
    private String bookName;

    private String bookCategory;
    private String bookDescription;

    @Min(value = 0, message = "The book price must not be less then zero")
    private double bookPrice;
    private String bookCondition;
    private String bookStatus;


    @Min(value = 0, message = "The book unit must not be less then zero")
    private int unitInStock;
    private String bookAuthor;

    @Transient
    private MultipartFile bookImage;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<CartItem> cartItemList;


    public int getbookId() {
        return bookId;
    }

    public void setbookId(int bookId) {
        this.bookId = bookId;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getbookCategory() {
        return bookCategory;
    }

    public void setbookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getbookDescription() {
        return bookDescription;
    }

    public void setbookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getbookPrice() {
        return bookPrice;
    }

    public void setbookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getbookCondition() {
        return bookCondition;
    }

    public void setbookCondition(String bookCondition) {
        this.bookCondition = bookCondition;
    }

    public String getbookStatus() {
        return bookStatus;
    }

    public void setbookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getbookAuthor() {
        return bookAuthor;
    }

    public void setbookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }


    public MultipartFile getbookImage() {
        return bookImage;
    }

    public void setbookImage(MultipartFile bookImage) {
        this.bookImage = bookImage;
    }


    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
} // The End of Class;