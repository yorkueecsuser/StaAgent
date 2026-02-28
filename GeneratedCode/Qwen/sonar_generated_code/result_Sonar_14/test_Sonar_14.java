import org.junit.Test;
import static org.junit.Assert.*;

class DependencyInjectionExample {

    private final DependencyA dependencyA;
    private final DependencyB dependencyB;

    @javax.inject.Inject // TRIGGER BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
        this.dependencyB = null;
    }

    @javax.inject.Inject // TRIGGER BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyB dependencyB) {
        this.dependencyA = null;
        this.dependencyB = dependencyB;
    }

    public String showBug() {
        if (dependencyA!= null) {
            return "DependencyA is injected";
        } else if (dependencyB!= null) {
            return "DependencyB is injected";
        } else {
            return "No dependency is injected";
        }
    }
}

class DependencyA {
    // Dummy class for demonstration
}

class DependencyB {
    // Dummy class for demonstration
}

public class DependencyInjectionExampleTest {

    @Test
    public void testConstructorWithDependencyA() {
        DependencyInjectionExample example = new DependencyInjectionExample(new DependencyA()); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("DependencyA is injected", example.showBug());
    }

    @Test
    public void testConstructorWithDependencyB() {
        DependencyInjectionExample example = new DependencyInjectionExample(new DependencyB()); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("DependencyB is injected", example.showBug());
    }
}