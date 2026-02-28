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
        this.foo(); // Calling the expensive operation
    }

    // Mutant code for Renaming mutation operator
    public void showMutatedBug() {
        // Renamed 'foo' to 'bar'
        this.bar();
    }

    // Renamed the method 'foo' to 'bar'
    @Expensive
    public void bar() {
        System.out.println("Performing expensive operation");
    }
}