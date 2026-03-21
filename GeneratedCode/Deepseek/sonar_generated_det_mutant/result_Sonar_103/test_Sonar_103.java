import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    private Main main = new Main();

    @Test
    public void testShowBug() {
        main.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
    }

    public static void main(String[] args) {
        MainTest mt = new MainTest();
        mt.testShowBug();
    }
}