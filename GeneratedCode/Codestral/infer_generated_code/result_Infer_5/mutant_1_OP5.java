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
        this.foo(); // Calling the expensive operation

        // Mutant: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }

    // Method to return a constant value for demonstration purposes
    private int getValue() {
        return 0; // This value makes the switch statement unreachable
    }
}