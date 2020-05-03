package ajayvikka.projects.gunni.services;

import ajayvikka.projects.gunni.dao.UserDAO;
import ajayvikka.projects.gunni.exceptions.UserNotFoundException;
import ajayvikka.projects.gunni.model.BaseUser;
import ajayvikka.projects.gunni.model.User;
import ajayvikka.projects.gunni.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public BaseUser validateUserCredentials(UserLogin userLogin) {
        User foundUser = userDAO.getUserByUserName(userLogin.getUserName());
        if(foundUser != null) {
            if(foundUser.getUserLogin().getPassword().equals(userLogin.getPassword())) {
                foundUser.getUserLogin().setPassword("");
                return foundUser.getBaseUser();
            }
            throw new UserNotFoundException("Incorrect Password!!!");
        }
        return null;
    }

}
