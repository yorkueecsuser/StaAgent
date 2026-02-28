import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleClassTest {

    @Test
    public void testShowBugWithConstructorInjection() {
        ExampleClass example = new ExampleClass();
        // TRIGGER BUG: InjectOnMemberAndConstructor
        assertEquals("Member should not be set via setter when constructor is @Inject", null, example.showBug());
    }
}

class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        this.member = member;
    }

    public String showBug() {
        return member;
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        System.out.println(example.showBug());
    }
}