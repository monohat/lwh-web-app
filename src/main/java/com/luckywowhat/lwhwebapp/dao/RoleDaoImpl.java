package com.luckywowhat.lwhwebapp.dao;

import com.luckywowhat.lwhwebapp.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Role findRoleByName(String theRoleName) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // now retrieve/read from database using name
        Query<Role> theQuery = currentSession.createQuery("from Role where name=:roleName", Role.class);
        theQuery.setParameter("roleName", theRoleName);

        Role theRole;

        try {
            theRole = theQuery.getSingleResult();
        } catch (Exception e) {
            theRole = null;
        }

        return theRole;
    }
}
