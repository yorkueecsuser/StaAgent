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

    // Method to always return false
    private boolean alwaysFalse() {
        return false;
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // Calling the expensive operation
        this.foo();

        // Mutant code: Unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This code is unreachable");
        }
    }
}