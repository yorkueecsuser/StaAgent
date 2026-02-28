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
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // Unreachable if-else statement mutant
            this.foo(); // This call is unreachable but added to create a mutant
        } else {
            System.out.println("Unreachable block");
        }
        this.foo();
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}