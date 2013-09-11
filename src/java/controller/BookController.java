/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.IBookDao;
import entities.Book;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author david
 */
@Named("bookController")
@RequestScoped
public class BookController implements Serializable {

    @Inject
    private IBookDao bookDao;

    private Book book = new Book();

    private Integer bookId;

    public String save() {
        bookDao.save(book);
        bookId = book.getId();
        return "editBookStages?faces-redirect=true&includeViewParams=true";
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}