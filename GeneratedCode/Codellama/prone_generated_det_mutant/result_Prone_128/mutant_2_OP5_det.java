import javax.inject.Inject;

class BuggyExample {

    @Inject
    private Dependency dependency;

    public void showBug() {
        int xantxytf = 0;switch  (xantxytf) {case 1:char ptbvricb = 'g';break;default:byte yfgjlojr = -85;break;}
        // BUG: OverridesJavaxInjectableMethod
        dependency.doSomething();
    
}

    @Inject
    private void doSomething() {
        // This method is not annotated with @Inject, but it overrides a method that is annotated with @javax.inject.Inject.
        // The method will not be Injected.
    }
}