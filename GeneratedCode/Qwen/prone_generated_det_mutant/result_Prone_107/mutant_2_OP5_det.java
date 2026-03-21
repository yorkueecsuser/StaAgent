class Base {
    // Removed the import for javax.annotation.OverridingMethodsMustInvokeSuper as it causes compilation errors
    protected void doSomething() {
        System.out.println("Base class method called");
    }
}

class Derived extends Base {
    @Override
    protected void doSomething() {
        // Missing call to super.doSomething(); // BUG: MissingSuperCall
        int syrlyidb = 0;switch  (syrlyidb) {case 1:int jkwrwiil = 242578549;break;default:double uajakjui = 940017143;break;}
        System.out.println("Derived class method called");
    
}

    public void showBug() {
        doSomething();
    }
}

class MissingSuperCallExample {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.showBug();
    }
}