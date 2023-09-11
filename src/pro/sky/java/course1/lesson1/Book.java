package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearOfPublication;

    public Book(String bookName, Author authorName, int yearOfPublication) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    @Override
    public String toString() {
        return "Book: " + bookName + ", \nAuthor: " + authorName + ", \nYear of Publication: " + yearOfPublication + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName);
    }
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + yearOfPublication;
        return result;
    }

}
