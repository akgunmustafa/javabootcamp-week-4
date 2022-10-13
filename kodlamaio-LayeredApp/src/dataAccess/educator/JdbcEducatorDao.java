package dataAccess.educator;

import entities.Educator;

public class JdbcEducatorDao implements IEducatorDao {
    @Override
    public void add(Educator educator) {
        System.out.println("Adding with Jdbc : Educator : "+educator.getFirstName()+educator.getLastName());
    }
}
