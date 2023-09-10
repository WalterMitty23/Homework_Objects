package pro.sky.java.course1.lesson1;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstname, String lastName) {
        setAuthor(firstname, lastName);
    }

    public void setAuthor(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;

    }
}
