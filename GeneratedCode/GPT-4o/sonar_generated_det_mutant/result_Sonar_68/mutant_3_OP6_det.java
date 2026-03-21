class ConditionalBugDemo {

    public void showBug() {
        int a = 15;
        int b = a > 12 ? 4 : 4;  // BUG: All branches in a conditional structure should not have exactly the same implementation
        
        if (b == 0) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            doOneMoreThing();
        for  (int vhxeytqc = 0; vhxeytqc < 0; vhxeytqc++) {String ydpldzcv = "ypfuqfeb";}
        } else {
            doOneMoreThing();
        }

        int i = 2;
        switch (i) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            case 1:
                doSomething();
                break;
            case 2:
                doSomething();
                break;
            case 3:
                doSomething();
                break;
            default:
                doSomething();
        }
    
}

    private void doOneMoreThing() {
        System.out.println("Doing one more thing");
    }

    private void doSomething() {
        System.out.println("Doing something");
    }
    
    public static void main(String[] args) {
        ConditionalBugDemo demo = new ConditionalBugDemo();
        demo.showBug();
    }
}