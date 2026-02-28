import java.lang.annotation.*;

interface I {
    void foo();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class A implements I {
    // This method overrides the unannotated method from the interface and is annotated with @Expensive
    @Expensive
    public void foo() {
        System.out.println("Performing expensive operation");
    }

    // Newly added mutated method
    @Expensive
    public void b() {
        System.out.println("Performing expensive operation");
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // This line now calls the mutated method 'b' instead of 'foo'
        this.b(); // Calling the expensive operation
    }
}