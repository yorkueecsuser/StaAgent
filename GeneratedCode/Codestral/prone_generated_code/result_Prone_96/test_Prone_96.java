import org.junit.Test;
import static org.junit.Assert.*;
import javax.inject.Inject;

interface MyInterface {
    @Inject // Added @Inject annotation to trigger the bug
    void myMethod();
}

class MyImplementation implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("My method implementation.");
    }
}

class BugExample {
    public void showBug() {
        MyImplementation myImpl = new MyImplementation();
        myImpl.myMethod();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}

public class BugExampleTest {
    @Test
    public void testJavaxInjectOnAbstractMethod() {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        // TRIGGER BUG: JavaxInjectOnAbstractMethod
        // The bug is triggered because the `myMethod` in the `MyInterface` is abstract and it's annotated with @Inject.
    }
}