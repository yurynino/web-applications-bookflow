/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.IBookDao;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author david
 */
@Named
@RequestScoped
public class BookController {

    @Inject
    private IBookDao bookDao;

    private BookCommand book = new BookCommand();

    public void save() {
        bookDao.save(book.toBook());
    }

    public void setBook(BookCommand book) {
        this.book = book;
    }

    public BookCommand getBook() {
        return book;
    }
}