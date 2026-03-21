class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  for  (int euvhxxzc = 0; euvhxxzc < 0; euvhxxzc++) {String nyeuctjn = "ntunzimy";}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}