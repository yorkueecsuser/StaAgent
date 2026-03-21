class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  boolean jfunctrw = false;while (jfunctrw && true && false && false && false && true && false && false && true && true && false && false) {String bhmlqowr = "ajdngatk";}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}