/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.imp;

import dao.IBookDao;
import entities.Book;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author dmontanor
 */
@ApplicationScoped
public class BookDao extends GenericDao<Book> implements IBookDao {

}
