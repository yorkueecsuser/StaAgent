class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  if (true && false && false && false && true && false && true && true && true && false && false) {String ywxfsquh = "dvtyxody";}else{byte xtxzmlyn = 27;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}