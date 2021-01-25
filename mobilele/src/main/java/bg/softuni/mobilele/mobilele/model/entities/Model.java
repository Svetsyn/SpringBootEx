package bg.softuni.mobilele.mobilele.model.entities;

import bg.softuni.mobilele.mobilele.model.entities.enums.Category;

import javax.persistence.*;

@Entity
@Table(name = "models")
public class Model extends BaseEntity{

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(length = 512)
    private String imgUrl;

    @Column(name = "start_year")
    private int startYear;
    @Column(name = "end_year")
    private int endYear;

    @ManyToOne
    private Brand brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", imgUrl='" + imgUrl + '\'' +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", brand=" + brand +
                '}';
    }
}
