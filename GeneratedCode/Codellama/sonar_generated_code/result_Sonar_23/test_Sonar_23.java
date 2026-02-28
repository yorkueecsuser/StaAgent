import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class BuggyCastTest {
    @Test
    public void testBuggyCast() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: This cast will throw a ClassCastException at runtime
        // because the actual type of the list is ArrayList<String>
        // and it cannot be cast to LinkedList<String>.
        LinkedList<String> linkedList = (LinkedList<String>) list;

        // Output the contents of the linked list
        System.out.println(linkedList);
    }
}