package org.example.userInterface;

import org.example.logic.Book;
import org.example.logic.BookCase;

import java.util.Scanner;

public class MainInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCase bookCase = new BookCase();

        while (true) {
            clearConsole();
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Найти книгу");
            System.out.println("4. Показать информацию о всех книгах");
            System.out.println("5. Сортировать книги по количеству звёзд");
            System.out.println("6. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author);
                    bookCase.addBook(newBook);
                    System.out.println("Книга добавлена!");
                    break;

                case 2:
                    System.out.print("Введите название книги для удаления: ");
                    String titleToRemove = scanner.nextLine();
                    bookCase.removeBook(titleToRemove);
                    System.out.println("Книга удалена, если она существовала.");
                    break;

                case 3:
                    System.out.print("Введите название книги для поиска: ");
                    String titleToFind = scanner.nextLine();
                    Book foundBook = bookCase.getBook(titleToFind);
                    if (foundBook != null) {
                        System.out.println(Book.showInfoAboutBook(foundBook));
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case 4:
                    System.out.println("Список всех книг:");
                    for (Book book : bookCase.getBookCase()) {
                        System.out.println(Book.showInfoAboutBook(book));
                        System.out.println("----------");
                    }
                    break;

                case 5:
                    bookCase.sortByStars();
                    System.out.println("Книги отсортированы по количеству звёзд.");
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите от 1 до 6.");
                    break;
            }
            System.out.println("Нажмите Enter для продолжения...");
            scanner.nextLine();
        }
    }

    // Метод для очистки консоли
    public static void clearConsole() {
        System.out.flush();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
