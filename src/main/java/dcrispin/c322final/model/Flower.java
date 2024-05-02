package dcrispin.c322final.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Random;

@Entity
@Table(schema = "flowers")
public class Flower {
    //filters can be combo boxes (select tag) or simple textboxes.
    //flower types: mixed, roses, lilies, tulips, dasies
    //occasions: Mother's day, birthday, thank you
    //colors: mixed, red, yellow, green, orange
    //sorting options: price:low to high, price:high to low

    @Id
    private String name;
    private String type;
    private String occasion;
    private String color;
    private double price;

    public Flower() {};

    public Flower(String name, String type, String occasion, String color, double price) {
        this.name = name;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
