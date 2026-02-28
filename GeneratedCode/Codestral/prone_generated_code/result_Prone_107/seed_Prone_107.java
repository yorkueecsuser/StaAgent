class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    }

    public void showBug() {
        initialize();
    }
}