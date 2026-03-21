import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.InjectMocks;
import org.junit.Test;

class ExampleWithBug {
    @Mock private Dependency dependency; // BUG: Annotated Mockito objects should be initialized
    @Spy private Helper helper; // BUG: Annotated Mockito objects should be initialized
    @InjectMocks private Service service; // BUG: Annotated Mockito objects should be initialized

    @Test
    public void showBug() {
        // This method is supposed to demonstrate the bug
        // Since mocks are not initialized, any interaction with them will result in NullPointerException
        service.performAction();
    }
}

class Dependency {
    public void doSomething() {
        // method implementation
    }
}

class Helper {
    public void assist() {
        // method implementation
    }
}

class Service {
    private Dependency dependency;
    private Helper helper;

    public void performAction() {
        dependency.doSomething();
        helper.assist();
    }
}