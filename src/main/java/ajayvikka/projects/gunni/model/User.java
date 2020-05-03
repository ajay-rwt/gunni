package ajayvikka.projects.gunni.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User extends BaseUser{

    @Embedded
    private UserLogin userLogin;

    public User() { }

    public User(
        long id,
        Name name,
        Contact contact,
        Address address,
        List<Role> roles,
        UserLogin userLogin
    ) {
        super(id, name, contact, address, roles);
        this.userLogin = userLogin;
    }

    public User(
            Name name,
            Contact contact,
            Address address,
            List<Role> roles,
            UserLogin userLogin
    ) {
        super(name, contact, address, roles);
        this.userLogin = userLogin;
    }
    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public BaseUser getBaseUser() {
        return new BaseUser(this.getId(), this.getName(), this.getContact(), this.getAddress(), this.getRoles());
    }

}
