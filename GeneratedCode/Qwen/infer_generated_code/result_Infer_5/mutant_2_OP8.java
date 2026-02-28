import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() {} // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        int originalVariable = 10; // Introducing a local variable
        System.out.println(originalVariable);

        // Mutated code
        int a = 10; // Renamed variable
        System.out.println(a);
    }
}