class BaseClass {
    public void initialize() {
        System.out.println("BaseClass initialize");
    }
}

class SubClass extends BaseClass {
    @Override
    public void initialize() {  int whtxmtxx = 0;switch  (whtxmtxx) {case 1:char jcsldmqv = 'f';break;default:byte ekenwtvp = 111;break;}
  // BUG: MissingSuperCall
        // Missing call to super.initialize()
        System.out.println("SubClass initialize");
    
}

    public void showBug() {
        initialize();
    }
}