package ajayvikka.projects.gunni.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private RolesEnum roleName;

    private String description;

    public Role() {

    }

    public Role(RolesEnum roleName) {
        this.id = roleName.ordinal();
        this.roleName = roleName;
        this.description = roleName.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RolesEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(RolesEnum roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
