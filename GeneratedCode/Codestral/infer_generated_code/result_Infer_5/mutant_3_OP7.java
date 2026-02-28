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

    // Method to return false for unreachable while loop
    private boolean getCondition() {
        return false;
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // Insert unreachable while loop as per mutation operator
        while (getCondition()) {
            // Unreachable code
            System.out.println("This is unreachable code");
        }
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        this.foo(); // Calling the expensive operation
    }
}