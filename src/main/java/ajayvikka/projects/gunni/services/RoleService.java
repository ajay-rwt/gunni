package ajayvikka.projects.gunni.services;

import ajayvikka.projects.gunni.dao.RoleDAO;
import ajayvikka.projects.gunni.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public Role getRole(long id) {
        return roleDAO.getRole(id);
    }

    public void addRole(Role role) {
        roleDAO.insertRole(role);
    }

}
