import org.junit.Test;
import static org.junit.Assert.*;

public class DependencyInjectionExampleTest {

    @Test
    public void testConstructorInjectionBug() {
        // Attempt to create an instance with one constructor
        DependencyInjectionExample instance1 = new DependencyInjectionExample("Dependency1"); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("Dependency1: Dependency1, Dependency2: Default", instance1.showBug());
        
        // Attempt to create an instance with two parameters constructor
        DependencyInjectionExample instance2 = new DependencyInjectionExample("Dependency1", "Dependency2"); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("Dependency1: Dependency1, Dependency2: Dependency2", instance2.showBug());
    }
}