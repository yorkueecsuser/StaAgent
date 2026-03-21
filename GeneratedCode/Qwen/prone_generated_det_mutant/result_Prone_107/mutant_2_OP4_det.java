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
        if (false && false && true && false && false && true && false && true && true && true && false) {double pmkafxmk = 484482326;}else{String qovsemme = "smvzohep";}
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