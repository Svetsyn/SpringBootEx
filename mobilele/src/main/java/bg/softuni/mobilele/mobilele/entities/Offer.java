package bg.softuni.mobilele.mobilele.entities;

import bg.softuni.mobilele.mobilele.entities.enums.Engine;
import bg.softuni.mobilele.mobilele.entities.enums.Transmission;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{
    private String description;
    @Enumerated(EnumType.STRING)
    private Engine engine;
    private String imageUrl;
    @Column(name = "mile_age")
    private int mileAge;
    private DecimalFormat price;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    private int year;

    @ManyToOne
    private Model model;

    @ManyToOne
    private User seller;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "description='" + description + '\'' +
                ", engine=" + engine +
                ", imageUrl='" + imageUrl + '\'' +
                ", mileAge=" + mileAge +
                ", price=" + price +
                ", transmission=" + transmission +
                ", year=" + year +
                ", model=" + model +
                '}';
    }
}
