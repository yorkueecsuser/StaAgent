import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {
    @Test
    public void testShowBug() {
        MainClass mainClass = new MainClass();
        mainClass.showBug();
        // The code above should trigger the bug because getClassLoader() is used instead of Thread.currentThread().getContextClassLoader()
        // TRIGGER BUG: JEE applications should not "getClassLoader"
    }
}