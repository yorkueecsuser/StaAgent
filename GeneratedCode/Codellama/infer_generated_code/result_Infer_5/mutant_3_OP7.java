import com.facebook.infer.annotation.Expensive;

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() {
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        // This method is expensive because it uses the @Expensive annotation,
        // but it overrides the unannotated method in the interface I, which
        // means it is not explicitly marked as expensive.
        boolean condition = getCondition();
        while (condition) {
            // added unreachable while loop
            break;
        }
    }
}