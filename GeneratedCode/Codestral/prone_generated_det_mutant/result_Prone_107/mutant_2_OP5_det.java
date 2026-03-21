class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  int fyfpvtft = 0;switch  (fyfpvtft) {case 1:long iyfxnzym = 875557364;break;default:boolean uluqmgax = false;break;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}