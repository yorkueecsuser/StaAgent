import org.junit.Test;
import static org.junit.Assert.*;

public class MyIteratorTest {

    @Test
    public void testNextThrowsNoSuchElementException() {
        MyIterator iterator = new MyIterator(new String[]{"a", "b", "c"});
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
    }
}