class Base {
    // Removing the import and annotation as the annotation is not available in standard Java libraries
    protected void initialize() {
        System.out.println("Base initialization");
    }
}

class Derived extends Base {
    @Override
    protected void initialize() {
        for  (int qjciqlsh = 0; qjciqlsh < 0; qjciqlsh++) {double nnohxwbw = 162880323;}
        // BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
        System.out.println("Derived initialization");
    
}

    public void showBug() {
        initialize();
    }
}

class BugDemonstration {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.showBug();
    }
}