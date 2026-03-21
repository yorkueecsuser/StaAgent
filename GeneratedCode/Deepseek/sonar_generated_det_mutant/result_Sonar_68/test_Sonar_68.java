import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    public void testShowBug() {
        Main.showBug();  // Calling the method that contains the bug
    }

    // Additional methods for the Main class
    public static void doOneMoreThing() {
        System.out.println("Doing one more thing");
    }

    public static void doSomething() {
        System.out.println("Doing something");
    }
}