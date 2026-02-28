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

    // Public method to demonstrate the bug
    public void showBug() {
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line should never be executed.");
        }
        this.foo(); // Calling the expensive operation
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }
}