package bg.softuni.mobilele.mobilele.view;

import bg.softuni.mobilele.mobilele.model.entities.enums.Engine;
import bg.softuni.mobilele.mobilele.model.entities.enums.Transmission;

import java.math.BigDecimal;

public class OfferSumaryViewModel {
    private Engine engine;
    private String imageUrl;
    private int mileage;
    private BigDecimal price;
    private int year;
    private Transmission transmission;

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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
