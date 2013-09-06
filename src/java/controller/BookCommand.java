/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Book;

/**
 *
 * @author david
 */
public class BookCommand {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book toBook() {
        return new Book(title);
    }
}
