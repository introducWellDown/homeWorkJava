package org.example.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCase {

    private List<Book> bookCase;

    public BookCase(){
        this.bookCase = new ArrayList<>();
    }

    public void addBook(Book newBook){
        this.bookCase.add(newBook);
    }

    public void removeBook(String titleOfBook){
        Iterator<Book> iterator = bookCase.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if(book.getTitleOfBook().equals(titleOfBook)){
                iterator.remove();
            }
        }
    }

    public List<Book> getBookCase() {
        return bookCase;
    }

    public Book getBook(String titleOfBook){
        for(Book book : bookCase){
            if(book.getTitleOfBook().equals(titleOfBook)){
                return book;
            }
        }
        return null;
    }

    public void sortByStars() {
        for (int i = 0; i < bookCase.size() - 1; i++) {
            for (int j = 0; j < bookCase.size() - i - 1; j++) {
                if (bookCase.get(j).getStars() < bookCase.get(j + 1).getStars()) {
                    Book tempBook = bookCase.get(j);
                    bookCase.set(j, bookCase.get(j + 1));
                    bookCase.set(j + 1, tempBook);
                }
            }
        }
    }

}
