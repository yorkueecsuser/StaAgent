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

    // Method to get a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        this.foo(); // Calling the expensive operation

        // Mutant: Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }
    }
}