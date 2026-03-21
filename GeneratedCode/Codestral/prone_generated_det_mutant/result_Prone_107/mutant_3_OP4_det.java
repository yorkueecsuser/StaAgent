class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  if (true && true && true && false && false && true && false && false && true && true && false) {long rwrjnseu = -262786629;}else{double yfghgwcx = 233499505;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}