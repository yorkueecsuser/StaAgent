import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        if (true && false && true && true && true && true && false && false && false && true && false) {char skkpfoef = 's';}
        // BUG: OverridesJavaxInjectableMethod
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}