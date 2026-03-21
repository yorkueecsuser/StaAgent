class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  int lbsmxrpx = 0;switch  (lbsmxrpx) {case 1:byte qvkyxhnu = -84;break;default:boolean yaqbahry = true;break;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}