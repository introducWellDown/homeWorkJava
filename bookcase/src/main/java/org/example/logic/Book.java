package org.example.logic;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Book {
    private String titleOfBook;
    private String authorOfBook;
    private String dateOfAdding;
    private int stars;

    public Book(String titleOfBook, String authorOfBook){
        this.titleOfBook = titleOfBook;
        this.authorOfBook = authorOfBook;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Добавлена "+"d.M.yyyy 'в' HH.mm");
        this.dateOfAdding = now.format(formatter);

        Random random= new Random();
        this.stars = random.nextInt(11);
    }
    public static String showInfoAboutBook(Book anyBook){
        String infoAboutBook = "Название книги: " + anyBook.getTitleOfBook() + "\n"+
                               "Автор книги: " + anyBook.getAuthorOfBook()+ "\n"+
                               "Дата добавления: " + anyBook.getDateOfAdding()+ "\n"+
                               "Количество звёзд: " + anyBook.getStars();
        return  infoAboutBook;
    }

    public String getTitleOfBook() {
        return this.titleOfBook;
    }

    public String getDateOfAdding() {
        return this.dateOfAdding;
    }

    public String getAuthorOfBook() {
        return this.authorOfBook;
    }

    public int getStars() {
        return this.stars;
    }
}

