/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.ArrayList;
import mvc.model.DAO.BookDAO;
import mvc.model.DTO.Book;

/**
 *
 * @author HP Pavilion
 */
public class BookController {
    BookDAO bookDAO = new BookDAO();

    public ArrayList<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    public boolean addBook(Book b) {
        return bookDAO.addBook(b);
    }

    public boolean deleteBook(String name) {
        return bookDAO.deleteBook(name);
    }
    
    public boolean updateNameBook(String name) {
        return bookDAO.updateNameBook(name);
    }
    
    public boolean updatePriceBook(int price) {
        return bookDAO.updatePriceBook(price);
    }
    
}
