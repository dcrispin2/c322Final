package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers")
public class Order {
    //For each order display the name of the flower,
    //the total cost,
    //the first name and last name of the recipient
    //and the status.

    @Id
    private String username;
    private String flower;
    private double price;
    private String fName;
    private String lName;
    private String status;

    public Order() {}

    public Order(String flower, double price, String fName, String lName, String status, String delivery, String username) {
        this.flower = flower;
        this.price = price;
        this.fName = fName;
        this.lName = lName;
        this.status = status;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
