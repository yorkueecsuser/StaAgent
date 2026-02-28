import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class InappropriateCollectionCallsTest {
    @Test
    public void testShowBug() {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}

// The code does not compile because the remove() method expects an instance of the list's type as its argument.