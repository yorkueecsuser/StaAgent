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

    // Method to simulate condition that always returns false
    private boolean getCondition() {
        return false;
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        this.foo(); // Calling the expensive operation

        // Unreachable if-else branch
        if (this.getCondition()) {
            System.out.println("This code should never execute");
        } else {
            System.out.println("This is the unreachable branch");
        }
    }
}