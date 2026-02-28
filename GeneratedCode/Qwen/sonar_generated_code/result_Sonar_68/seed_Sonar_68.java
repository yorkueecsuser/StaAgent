class ConditionalBugExample {

    public void doOneMoreThing() {
        System.out.println("Doing one more thing.");
    }

    public void doSomething() {
        System.out.println("Doing something.");
    }

    public void showBug1(int b) {
        if (b == 0) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            doOneMoreThing();
        } else {
            doOneMoreThing();
        }
    }

    public int showBug2(int a) {
        int b = a > 12? 4 : 4;  // BUG: All branches in a conditional structure should not have exactly the same implementation
        return b;
    }

    public void showBug3(int i) {
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

    public static void main(String[] args) {
        ConditionalBugExample example = new ConditionalBugExample();
        example.showBug1(0);
        example.showBug1(1);
        example.showBug2(10);
        example.showBug3(1);
        example.showBug3(2);
        example.showBug3(3);
        example.showBug3(4);
    }
}