import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class BookCollection {
    private List<Book> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the collection: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed from the collection: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the collection.");
    }

    public void displayCollection() {
        System.out.println("Book Collection:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class BookExample {
    public static void main(String[] args) {
        BookCollection myLibrary = new BookCollection();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        myLibrary.displayCollection();

        myLibrary.removeBook("978-0061120084");

        myLibrary.displayCollection();
    }
}
