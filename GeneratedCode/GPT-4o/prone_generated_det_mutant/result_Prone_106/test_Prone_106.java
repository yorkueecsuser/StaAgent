import org.junit.Test;
import static org.junit.Assert.*;

// Define a custom annotation to simulate scope annotations
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CustomScope {}

// A simple service class
class DatabaseService {
    public String connect() {
        return "Connected to database";
    }
}

// A consumer class that incorrectly uses CustomScope as a qualifier
class MisplacedScopeAnnotationExample {

    @CustomScope // BUG: MisplacedScopeAnnotations
    private DatabaseService databaseService;

    public String showBug() {
        if (databaseService != null) {
            return databaseService.connect();
        } else {
            return "DatabaseService is not initialized";
        }
    }

    public static void main(String[] args) {
        MisplacedScopeAnnotationExample example = new MisplacedScopeAnnotationExample();
        System.out.println(example.showBug());
    }
}

public class MisplacedScopeAnnotationExampleTest {

    @Test
    public void testShowBug() {
        MisplacedScopeAnnotationExample example = new MisplacedScopeAnnotationExample();
        String result = example.showBug(); // TRIGGER BUG: MisplacedScopeAnnotations
        assertEquals("Connected to database", result); // TRIGGER BUG: MisplacedScopeAnnotations
    }
}