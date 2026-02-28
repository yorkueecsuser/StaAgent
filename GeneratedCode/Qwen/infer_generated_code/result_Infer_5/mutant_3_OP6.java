import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() { // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return false;
    }
}