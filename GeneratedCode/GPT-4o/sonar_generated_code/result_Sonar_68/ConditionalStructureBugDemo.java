class ConditionalStructureBugDemo {

    public void showBug() {
        int a = 10;
        int b;
        
        // Demonstrating the bug with if-else
        if (a > 5) {
            doOneMoreThing(); // BUG: All branches in a conditional structure should not have exactly the same implementation
        } else {
            doOneMoreThing(); // BUG: All branches in a conditional structure should not have exactly the same implementation
        }
        
        // Demonstrating the bug with conditional operator
        b = a > 12 ? 4 : 4; // BUG: All branches in a conditional structure should not have exactly the same implementation
        
        // Demonstrating the bug with switch-case
        int i = 2;
        switch (i) {
            case 1:
                doSomething(); // BUG: All branches in a conditional structure should not have exactly the same implementation
                break;
            case 2:
                doSomething(); // BUG: All branches in a conditional structure should not have exactly the same implementation
                break;
            case 3:
                doSomething(); // BUG: All branches in a conditional structure should not have exactly the same implementation
                break;
            default:
                doSomething(); // BUG: All branches in a conditional structure should not have exactly the same implementation
        }
    }

    private void doOneMoreThing() {
        System.out.println("Doing one more thing...");
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        ConditionalStructureBugDemo demo = new ConditionalStructureBugDemo();
        demo.showBug();
    }
}