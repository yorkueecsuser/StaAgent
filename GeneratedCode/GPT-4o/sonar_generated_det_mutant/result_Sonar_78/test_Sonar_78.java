import org.junit.Test;

class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something important...");
    }
}

class MyComponent {  // Anyone can call the default constructor

    MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

    public void myBusinessMethod() {
        collaborator.doSomething();  // This will fail in classes new-ed by a caller
    }

    public void showBug() {
        try {
            myBusinessMethod();  // Attempt to use the uninitialized collaborator
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

public class MyComponentTest {

    @Test
    public void testShowBug() {
        MyComponent component = new MyComponent();
        component.showBug();  // TRIGGER BUG: Constructor injection should be used instead of field injection
    }
}