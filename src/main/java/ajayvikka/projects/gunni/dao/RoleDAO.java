package ajayvikka.projects.gunni.dao;

import ajayvikka.projects.gunni.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void insertRole(Role role) {
        if(getRole(role.getId()) == null)
            entityManager.persist(role);
    }

    public Role getRole(long roleId) {
        return entityManager.find(Role.class, roleId);
    }

}
