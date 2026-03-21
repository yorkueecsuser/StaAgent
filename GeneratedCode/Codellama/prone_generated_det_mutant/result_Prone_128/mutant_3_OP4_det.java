import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        if (true && false && false && true && true && true && true && true && false && true && false) {long fisbaalk = -90754789;}else{byte dryixvtf = -115;}
        // BUG: OverridesJavaxInjectableMethod
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}