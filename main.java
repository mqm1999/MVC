/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.view.BookView;

/**
 *
 * @author HP Pavilion
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookView bookView = new BookView();
        bookView.execute();
    }
    
}
