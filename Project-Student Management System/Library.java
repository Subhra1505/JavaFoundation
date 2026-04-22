import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void removeBook(int id) {
        boolean found = false;

        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void searchBook(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}
