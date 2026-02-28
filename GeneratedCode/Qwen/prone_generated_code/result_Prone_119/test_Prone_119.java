import org.junit.Test;
import static org.junit.Assert.*;

class NonFinalCompileTimeConstantExample {

    void f(@CompileTimeConstant String y) {
        // Method implementation
    }

    void g(@CompileTimeConstant String x) {
        x = f(x); // TRIGGER BUG: NonFinalCompileTimeConstant
    }

    public String showBug() {
        String constantString = "Hello";
        g(constantString);
        return constantString;
    }

    public static void main(String[] args) {
        NonFinalCompileTimeConstantExample example = new NonFinalCompileTimeConstantExample();
        example.showBug();
    }
}

public class NonFinalCompileTimeConstantExampleTest {

    @Test
    public void testShowBug() {
        NonFinalCompileTimeConstantExample example = new NonFinalCompileTimeConstantExample();
        example.showBug(); // TRIGGER BUG: NonFinalCompileTimeConstant
    }
}