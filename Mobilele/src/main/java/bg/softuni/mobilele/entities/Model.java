package bg.softuni.mobilele.entities;

import bg.softuni.mobilele.entities.enums.ModelCategory;

import javax.persistence.*;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategory category;

    @Column(length = 512)
    private String imageUrl;

    private int startYear;

    private int endYear;

    @ManyToOne
    private Brand brand;

    public String getName() {
        return name;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public ModelCategory getCategory() {
        return category;
    }

    public Model setCategory(ModelCategory category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Model setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getStartYear() {
        return startYear;
    }

    public Model setStartYear(int startYear) {
        this.startYear = startYear;
        return this;
    }

    public int getEndYear() {
        return endYear;
    }

    public Model setEndYear(int endYar) {
        this.endYear = endYar;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public String toString() {
        return "ModelEntity{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", imageUrl='" + imageUrl + '\'' +
                ", startYear=" + startYear +
                ", endYar=" + endYear +
                ", brand=" + brand +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
