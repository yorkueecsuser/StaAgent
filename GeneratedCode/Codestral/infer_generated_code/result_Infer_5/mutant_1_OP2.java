import java.lang.annotation.*;

// A class implementing an interface with an unannotated method
interface I {
    void foo();
}

// Marker annotation used for static analysis
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    // This method overrides the unannotated method from the interface and is annotated with @Expensive
    @Expensive
    public void foo() {
        System.out.println("Performing expensive operation");
    }

    // New method that calls this.foo()
    private void callFoo() {
        this.foo(); // Calling the expensive operation
    }

    // Public method to demonstrate the bug
    public void showBug() {
        this.callFoo(); // Calling the new method that calls the expensive operation
        this.callFoo(); // Duplicated statement
    }
}