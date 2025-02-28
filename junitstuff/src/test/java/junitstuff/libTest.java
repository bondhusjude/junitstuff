package junitstuff;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class libTest {
    @Test
    public void testCheckout() {
        var lib = new lib();
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        lib.addBook(b);
        lib.checkout(b);
        assert(lib.away.contains(b));
    }

    @Test
    public void testReturnBook() {
        var lib = new lib();
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        lib.returnBook(b);
        assert(lib.shelf.contains(b));
    }

    @Test
    public void testAddBook() {
        var lib = new lib();
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        lib.addBook(b);
        assert(lib.shelf.contains(b));
    }

    @Test
    public void testGetTotalBooks() {
        var lib = new lib();
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        lib.addBook(b);
        assertEquals(1, lib.getTotalBooks());
    }

    @Test
    public void testCheckBookStatus() {
        var lib = new lib();
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        lib.addBook(b);
        assertEquals("book is on shelf it has been checked out this much 0", lib.checkBookStatus(b));
    }
}
