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
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
        }

        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        this.foo(); // Calling the expensive operation
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0 to make the switch statement unreachable
    }
}