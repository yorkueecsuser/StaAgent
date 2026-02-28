import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() { 
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        String qwerasdf = "unused"; // Dead store mutation
    }

    public void showBug() {
        foo();
        int zxvbnmjk = 42; // Dead store mutation
    }
}