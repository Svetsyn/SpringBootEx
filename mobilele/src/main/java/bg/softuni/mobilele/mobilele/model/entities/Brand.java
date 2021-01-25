package bg.softuni.mobilele.mobilele.model.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand  extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
