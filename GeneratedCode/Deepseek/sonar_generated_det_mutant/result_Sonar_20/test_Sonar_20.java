import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void showBugTest() {
        List<String> lst = new ArrayList<>();
        lst.add("xhello");
        lst.add("world");
        Main.showBug(lst); // TRIGGER BUG: Collections should not be modified while they are iterated
    }
}