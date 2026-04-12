/* 10. Library Management System */

class BookUnavailableException extends Exception {
    public BookUnavailableException(String msg) {
        super(msg);
    }
}
class Book {
    private String title;
    private String author;
    private int copiesAvailable;

    public Book(String t, String a, int cp) {
        title = t;
        author = a;
        copiesAvailable = cp;
    }
    public int getAvailableCopies() {
        return copiesAvailable;
    }
    public String getTitle() {
        return title;
    }
    public void issueBook() throws BookUnavailableException {
        if (copiesAvailable <= 0) {
            throw new BookUnavailableException("Book Unavailable (No Copies left)");
        }
    copiesAvailable--;
        System.out.println("Book Issued Successfully!\nTitle: " + title + " | Copies Left: " + copiesAvailable + "\n");
    }
    public void returnBook() {
        copiesAvailable++;
        System.out.println("Book Title: " + title + " | Author: " + author + "\nSuccessfully Returned\n");
    }
}
public class SET4P10 {
    public static void main(String[] args) {
        System.out.println("--Library Management System--");
        Book books[] = new Book[2];
        books[0] = new Book("Biology", "Nirmala", 2);
        books[1] = new Book("Chemistry", "Rahul Kohli", 1);
        System.out.println("Available Copies: " + books[0].getAvailableCopies() + " | Book Title: " + books[0].getTitle());
        System.out.println("Available Copies: " + books[1].getAvailableCopies() + " | Book Title: " + books[1].getTitle());
        System.out.print("\n");
        try {
            books[0].issueBook();
            books[0].issueBook();
            books[0].returnBook();

            books[1].issueBook();
            books[1].issueBook();
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}