import org.junit.Test;
import static org.junit.Assert.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton // BUG: MisplacedScopeAnnotations
class MisplacedScopeAnnotationsExample {

    @Singleton // BUG: MisplacedScopeAnnotations
    private Dependency dependency;

    @Inject
    public MisplacedScopeAnnotationsExample(Dependency dependency) {
        this.dependency = dependency;
    }

    public String showBug() {
        return dependency.getMessage();
    }

    public static class Dependency {
        public String getMessage() {
            return "Hello, World!";
        }
    }

    public static void main(String[] args) {
        MisplacedScopeAnnotationsExample example = new MisplacedScopeAnnotationsExample(new Dependency());
        System.out.println(example.showBug());
    }
}

public class MisplacedScopeAnnotationsExampleTest {

    @Test
    public void testShowBug() {
        MisplacedScopeAnnotationsExample example = new MisplacedScopeAnnotationsExample(new MisplacedScopeAnnotationsExample.Dependency());
        assertEquals("Hello, World!", example.showBug()); // TRIGGER BUG: MisplacedScopeAnnotations
    }
}