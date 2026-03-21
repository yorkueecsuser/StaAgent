import org.junit.Test;
import static org.junit.Assert.*;

public class MyIteratorTest {
    @Test
    public void testNext() {
        MyIterator iterator = new MyIterator();
        iterator.showBug(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
    }
}