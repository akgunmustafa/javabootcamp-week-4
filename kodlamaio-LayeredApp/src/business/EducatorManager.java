package business;

import Logging.Logger;
import dataAccess.educator.IEducatorDao;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class EducatorManager {
    private IEducatorDao iEducatorDao;
    private Logger[] loggers;
    List<Educator> educators=new ArrayList<Educator>();
    public EducatorManager(IEducatorDao iEducatorDao,Logger[] loggers,List<Educator> educators){
        this.iEducatorDao=iEducatorDao;
        this.loggers=loggers;
        this.educators=educators;
    }

    public void add(Educator educator){
        iEducatorDao.add(educator);

        for (Logger logger: loggers){
            logger.log(educator.getFirstName()+educator.getLastName());
        }

    }
}
