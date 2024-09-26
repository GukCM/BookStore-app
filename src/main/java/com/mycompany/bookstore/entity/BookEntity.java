package com.mycompany.bookstore.entity;

import java.io.Serializable;

public class BookEntity implements Serializable {

    private String name;
    private String description;
    private Double pricePerQty;
    private Integer availableQty;
    private String authorName;
    private String authorEmail;
    private Long BookID;

    public Long getBookID() {
        return BookID;
    }

    public void setBookID(Long bookID) {
        BookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPricePerQty() {
        return pricePerQty;
    }

    public void setPricePerQty(Double pricePerQty) {
        this.pricePerQty = pricePerQty;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public String getAuthorName(String authorName) {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

}
