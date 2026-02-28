import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            condition = doOneMoreThing();
        } else {
            for (boolean unreachableLoop = true; unreachableLoop; ) { // Unreachable for loop
                System.out.println("Unreachable code");
            }
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // BUG: All branches in a conditional structure should not have exactly the same implementation
        for (boolean unreachableLoop = true; unreachableLoop; ) { // Unreachable for loop
            System.out.println("Unreachable code");
        }

        boolean switchCondition;
        switch (i) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            case 1:
                switchCondition = doSomething();
                break;
            case 2:
                switchCondition = doSomething();
                break;
            case 3:
                switchCondition = doSomething();
                break;
            default:
                for (boolean unreachableLoop = true; unreachableLoop; ) { // Unreachable for loop
                    System.out.println("Unreachable code");
                }
                switchCondition = doSomething();
        }

        return true;
    }

    private boolean doOneMoreThing() {
        System.out.println("Doing one more thing");
        return true;
    }

    private boolean doSomething() {
        System.out.println("Doing something");
        return true;
    }
}