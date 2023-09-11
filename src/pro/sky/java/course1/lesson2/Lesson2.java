package pro.sky.java.course1.lesson2;

import pro.sky.java.course1.lesson1.Author;
import pro.sky.java.course1.lesson1.Book;

public class Lesson2 {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevskiy");
        Author author2 = new Author("George", "Orwell");

        Book book1 = new Book("Crime and Punishment", author1, 1866);
        Book book2 = new Book("1984", author2, 1949);

        book1.setYearOfPublication(2001);

        System.out.println("    Книга 1:");
        System.out.println(book1);

        System.out.println("    Книга 2:");
        System.out.println(book2);

        boolean authorsEqual = author1.equals(author2);
        System.out.println("Схожи ли авторы - " + authorsEqual);

        boolean booksEqual = book1.equals(book2);
        System.out.println("Схожи ли названия и год публикации книг - " + booksEqual);

        System.out.println();

        int author1HashCode = author1.hashCode();
        int book1HashCode = book1.hashCode();

        System.out.println("Hash Code of Author 1: " + author1HashCode);
        System.out.println("Hash Code of Book 1 : " + book1HashCode);
    }

}
