package ajayvikka.projects.gunni.dao;

import ajayvikka.projects.gunni.exceptions.GunniExceptionFormat;
import ajayvikka.projects.gunni.exceptions.UserNotFoundException;
import ajayvikka.projects.gunni.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void insertUser(User user) {
        if(getUser(user.getId()) == null) {
            entityManager.persist(user);
        }
    }

    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    public User getUserByUserName(String userName) {
        List<User> users = entityManager.createQuery("select u from User u where u.userLogin.userName = '"+userName+"'").getResultList();
        if(users != null && users.size() != 0)
            return users.get(0);
        throw new UserNotFoundException("This User ID does not exist.");
    }

}
