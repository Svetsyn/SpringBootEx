package bg.softuni.mobilele.mobilele.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class TestEntity extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
