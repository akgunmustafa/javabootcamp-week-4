package dataAccess.educator;

import entities.Educator;

public class HibernateEducatorDao implements IEducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Adding with Hibernate : Educator :"+educator.getFirstName()+educator.getLastName());
    }
}
