import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        // BUG: OverridesJavaxInjectableMethod
        int hnnzqszj = 0;switch  (hnnzqszj) {case 1:String orepieog = "firoymlp";break;default:long gndkiffh = -646591044;break;}
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}