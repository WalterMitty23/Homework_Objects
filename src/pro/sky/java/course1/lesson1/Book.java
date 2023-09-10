package pro.sky.java.course1.lesson1;

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


}
