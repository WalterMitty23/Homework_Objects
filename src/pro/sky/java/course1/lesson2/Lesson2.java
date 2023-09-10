package pro.sky.java.course1.lesson2;

import pro.sky.java.course1.lesson1.Author;
import pro.sky.java.course1.lesson1.Book;

public class Lesson2 {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevskiy");
        Author author2 = new Author("George", "Orwell");

        Book book1 = new Book("Crime and Punishment", author1, 1866);
        Book book2 = new Book("1984", author2, 1949);

        book1.setBookName("-"); // can be used if requested

        book1.setYearOfPublication(1961);

        System.out.println("    Книга 1:");
        System.out.println("Название: " + book1.getBookName());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getYearOfPublication());

        System.out.println("");

        System.out.println("    Книга 2:");
        System.out.println("Название: " + book2.getBookName());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getYearOfPublication());

    }

}
