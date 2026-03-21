import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        // BUG: OverridesJavaxInjectableMethod
        if (false && false && true && true && true && false && true && false && true && false && false) {double ryvgfogk = 548834898;}
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}