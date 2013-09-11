/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.imp;

import dao.IGenericDao;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

/**
 *
 * @author dmontanor
 */
public abstract class GenericDao<T> implements IGenericDao<T> {

    @PersistenceUnit(unitName = "bookflowPU")
    private EntityManagerFactory emf;

    @Resource
    private UserTransaction utx;

    @Override
    public void save(T obj) {
        System.out.println("Saving " + obj);
        try{
            utx.begin();
            EntityManager em = emf.createEntityManager();
            em.persist(obj);
            utx.commit();
        }catch(Exception e1){
            e1.printStackTrace();
            try {
                utx.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
