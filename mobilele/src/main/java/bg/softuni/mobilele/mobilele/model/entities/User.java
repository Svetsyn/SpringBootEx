package bg.softuni.mobilele.mobilele.model.entities;

import bg.softuni.mobilele.mobilele.model.entities.enums.Role;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String username;
    private String firsName;
    private String lastName;
    private boolean isActive;
    @Enumerated(EnumType.STRING)
    private Role userRole;
    private String imgUrl;

}
