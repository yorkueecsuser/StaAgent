import org.junit.Test;
import static org.junit.Assert.*;

public class IterableAsIteratorTest {

    @Test
    public void testShowBug() {
        String[] values = {"a", "b", "c"};
        IterableAsIterator iterableIterator = new IterableAsIterator(values);

        // First iteration
        StringBuilder firstIterationResult = new StringBuilder();
        for (String s : iterableIterator) {
            firstIterationResult.append(s).append(" ");
        }
        assertEquals("a b c ", firstIterationResult.toString());

        // Second iteration - should iterate again, but it won't due to shared state
        StringBuilder secondIterationResult = new StringBuilder();
        for (String s : iterableIterator) { // TRIGGER BUG: "iterator" should not return "this"
            secondIterationResult.append(s).append(" ");
        }
        assertEquals("a b c ", secondIterationResult.toString()); // This will fail

        // Nested iteration - affects each other due to shared state
        StringBuilder nestedIterationResult = new StringBuilder();
        for (String outer : iterableIterator) { // TRIGGER BUG: "iterator" should not return "this"
            for (String inner : iterableIterator) { // TRIGGER BUG: "iterator" should not return "this"
                nestedIterationResult.append(outer).append("-").append(inner).append(" ");
            }
        }
        assertEquals("a-a a-b a-c b-a b-b b-c c-a c-b c-c ", nestedIterationResult.toString()); // This will fail
    }
}