package bg.softuni.entities;

import bg.softuni.entities.enums.Engine;
import bg.softuni.entities.enums.Transmission;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private Engine engine;
    private String imageUrl;
    private int mileage;
    private BigDecimal price;
    private int year;
    private String description;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    @ManyToOne
    private Model model;

    @ManyToOne
    private User user;

    public Engine

    getEngine() {
        return engine;
    }

    public Offer setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Offer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Offer setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Offer setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Offer setYear(int year) {
        this.year = year;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Offer setTransmission(
            Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Model getModel() {
        return model;
    }

    public Offer setModel(Model model) {
        this.model = model;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Offer setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "OfferEntity{" +
                "engine=" + engine +
                ", imageUrl='" + imageUrl + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", year=" + year +
                ", transmission=" + transmission +
                ", model=" + model +
                ", user=" + user +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
