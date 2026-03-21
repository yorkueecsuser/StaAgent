import org.junit.Test;
import static org.junit.Assert.*;

public class MyIteratorTest {

    @Test
    public void testShowBugTriggersNoSuchElementException() {
        MyIterator iterator = new MyIterator(new String[]{"Hello", "World"});
        iterator.showBug(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
    }
}