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
        foo();
    }

    // Mutant: Renaming the 'foo' method to 'bar'
    @Expensive
    public void bar() {} // This is the mutant method

    public void showMutantBug() {
        bar(); // Calling the mutant method
    }
}