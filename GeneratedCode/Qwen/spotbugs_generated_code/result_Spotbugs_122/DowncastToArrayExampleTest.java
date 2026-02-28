import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DowncastToArrayExampleTest {

    @Test(expected = ClassCastException.class)
    public void testShowBugWithArrayList() {
        DowncastToArrayExample example = new DowncastToArrayExample();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        example.showBug(list); // TRIGGER BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
}