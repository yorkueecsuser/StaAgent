class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  boolean fzprbldk = false;while (fzprbldk && true && false && false && true && false && false && false && false && false && false && false) {boolean zkqomjfb = true;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}