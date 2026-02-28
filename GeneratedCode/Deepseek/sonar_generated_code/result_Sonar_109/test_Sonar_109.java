import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class MyIteratorTest {

    @Test
    public void testNext() {
        List<String> data = new ArrayList<>(); // empty list
        MyIterator iterator = new MyIterator(data);
        try {
            iterator.next(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
            fail("Expected NoSuchElementException to be thrown");
        } catch (NoSuchElementException e) {
            // expected exception
        }
    }
}