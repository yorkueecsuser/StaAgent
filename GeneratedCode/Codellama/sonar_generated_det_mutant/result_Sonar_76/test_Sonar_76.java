import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.Optional;

class Buggy {
    public static void main(String[] args) {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            System.out.println("I'm the bug!");
        }
    }
}

class BuggyTest {
    @Test
    public void testBug() {
        Optional<LocalDate> date = Optional.of(LocalDate.of(2023, 3, 14));
        synchronized (date) {
            System.out.println("I'm the bug!");
        }
        // TRIGGER BUG: Value-based classes should not be used for locking
        // This line of code triggers the bug by attempting to lock on an instance of a value-based class, which is prohibited by the Java Language Specification.
        assertFalse(date.isPresent());
    }
}