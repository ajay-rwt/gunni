package ajayvikka.projects.gunni.model;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public class BaseUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Name name;

    @Embedded
    private Contact contact;

    @Embedded
    private Address address;

    @OneToMany(targetEntity = Role.class)
    private List<Role> roles;

    public BaseUser() { }

    public BaseUser(
            long id,
            Name name,
            Contact contact,
            Address address,
            List<Role> roles
    ) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.roles = roles;
    }

    public BaseUser(
            Name name,
            Contact contact,
            Address address,
            List<Role> roles
    ) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
