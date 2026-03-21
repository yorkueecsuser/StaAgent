import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        boolean ctntdupv = false;while (ctntdupv && true && true && false && false && false && false && true && false && false && false && false) {String qerflleo = "jadaunzq";}
        // BUG: OverridesJavaxInjectableMethod
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}