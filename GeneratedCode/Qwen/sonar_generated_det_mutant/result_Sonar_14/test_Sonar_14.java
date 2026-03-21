import org.junit.Test;
import static org.junit.Assert.*;

public class DependencyInjectionExampleTest {

    @Test
    public void testShowBugWithSingleDependency() {
        DependencyA dependencyA = new DependencyA();
        DependencyInjectionExample example = new DependencyInjectionExample(dependencyA); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("Only DependencyA injected: DependencyA", example.showBug());
    }

    @Test
    public void testShowBugWithMultipleDependencies() {
        DependencyA dependencyA = new DependencyA();
        DependencyB dependencyB = new DependencyB();
        DependencyInjectionExample example = new DependencyInjectionExample(dependencyA, dependencyB); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("Both dependencies injected: DependencyA, DependencyB", example.showBug());
    }
}