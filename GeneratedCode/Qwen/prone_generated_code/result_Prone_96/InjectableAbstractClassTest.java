import org.junit.Test;
import javax.inject.Inject;

interface InjectableInterface {
    @Inject // BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

abstract class InjectableAbstractClass implements InjectableInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method");
    }

    public void showBug() {
        abstractMethod();
        defaultMethod();
    }
}

class JavaxInjectOnAbstractMethodExample extends InjectableAbstractClass {
    public static void main(String[] args) {
        JavaxInjectOnAbstractMethodExample example = new JavaxInjectOnAbstractMethodExample();
        example.showBug();
    }
}

public class JavaxInjectOnAbstractMethodExampleTest {

    @Test
    public void testShowBug() {
        JavaxInjectOnAbstractMethodExample example = new JavaxInjectOnAbstractMethodExample();
        example.showBug(); // TRIGGER BUG: JavaxInjectOnAbstractMethod
    }
}