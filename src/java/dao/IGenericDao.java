/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author dmontanor
 */
public interface IGenericDao<T> {

    public void save(T obj);

}
