package junitstuff;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BookTest {
    @Test
    public void Book_Test() {
        var b = new Book("The Book Title Yes", "The Author", "1234567890", 12.34, 2021, 0);
        assertEquals("The Book Title Yes", b.getTitle());
        assertEquals("The Author", b.getAuthor());
        assertEquals("1234567890", b.getIsbn());
        assertEquals(12.34, b.getPrice(), 0.001);
        assertEquals(2021, b.getYear());
        assertEquals(0, b.getCheckoutAmount());
    }
}
