/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mvc.model.DTO.Book;

/**
 *
 * @author HP Pavilion
 */
public class BookDAO {

    ArrayList<Book> library = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public BookDAO(){
        Book defaultBook = new Book("BookA", 1000);
        library.add(defaultBook);
    }
    
    public ArrayList<Book> getAllBooks(){
        return library;
        
    }

    public boolean addBook(Book b) {
        return library.add(b);
    }

    public boolean deleteBook(String name) {
        int flag = -1;
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).getName().equals(name)){
                flag = i;
            }
        }
        if(flag >= 0){
            library.remove(flag);
            return true;
        }
        return false;
    }
    
    public boolean updateNameBook(String name){
        int flag = -1;
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).getName().equals(name)){
                flag = i;
            }
        }
        if(flag >= 0){
            library.get(flag).setName(name);
            return true;
        }
        return false;
    }
    
    public boolean updatePriceBook(int price){
        int flag = -1;
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).getPrice() == price){
                flag = i;
            }
        }
        if(flag >= 0){
            library.get(flag).setPrice(price);
            return true;
        }
        return false;
    }

}
