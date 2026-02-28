import java.lang.annotation.*;

interface I {
    void foo();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    @Expensive
    public void foo() {
        System.out.println("Performing expensive operation");
    }

    public void showBug() {
        // Inserting unreachable if statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This block is unreachable
            System.out.println("This is an unreachable if statement");
        }

        this.foo();
    }

    // A method to generate the condition for the if statement
    private boolean getCondition() {
        return false; // This ensures the if statement is always unreachable
    }
}