import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.lang.UnsupportedOperationException;

public class ImmutableListTest {
    @Test(expected = UnsupportedOperationException.class)
    public void testShowBug() {
        ImmutableList<String> immutableList = new ImmutableList<>(new ArrayList<>());
        immutableList.showBug(); // This line triggers the bug: DoNotCall
    }
}