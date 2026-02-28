import org.junit.Test;
import static org.junit.Assert.*;

class ParentClass {
    public void someMethod() {
        System.out.println("Parent method called");
    }
    
    public String showBug() {
        return "This is a placeholder to satisfy the override requirement";
    }
}

class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        // BUG: CallSuperLast
    }

    @Override
    public String showBug() {
        someMethod();
        return "Bug demonstrated";
    }
}

public class ExampleClassTest {

    @Test
    public void testShowBug() {
        ExampleClass example = new ExampleClass();
        String result = example.showBug(); // TRIGGER BUG: CallSuperLast
        assertEquals("This is a placeholder to satisfy the override requirement", result);
    }
}