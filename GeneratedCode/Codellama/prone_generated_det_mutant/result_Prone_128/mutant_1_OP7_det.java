import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        // BUG: OverridesJavaxInjectableMethod
        boolean vjxgolrx = false;while (vjxgolrx && true && true && true && false && false && true && false && false && false && false && false) {byte mivvyatl = -104;}
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}