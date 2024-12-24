package workshop1;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

public class qn16 {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        System.out.println(book);
    }
}
