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
    }
}

class B implements I {
    @Expensive
    public void foo() {
        // This method is expensive because it uses the @Expensive annotation,
        // and it overrides the unannotated method in the interface I, which
        // means it is explicitly marked as expensive.
    }
}

class C implements I {
    public void foo() {
        // This method is not expensive because it does not use the @Expensive annotation,
        // and it overrides the unannotated method in the interface I, which
        // means it is not explicitly marked as expensive.
    }
}