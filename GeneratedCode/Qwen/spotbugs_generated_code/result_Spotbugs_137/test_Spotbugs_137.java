import org.junit.Test;
import static org.junit.Assert.*;

public class GenericCollectionBugTest {

    @Test
    public void testShowBugWithFoo() {
        GenericCollectionBug bugDemo = new GenericCollectionBug();
        Foo foo = new Foo("Hello");
        Bar bar = new Bar(1);
        assertFalse(bugDemo.showBug(foo, bar)); // TRIGGER BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES) 
    }

    @Test
    public void testShowBugWithAnotherFoo() {
        GenericCollectionBug bugDemo = new GenericCollectionBug();
        Foo foo = new Foo("World");
        Bar bar = new Bar(2);
        assertFalse(bugDemo.showBug(foo, bar)); // TRIGGER BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES) 
    }
}