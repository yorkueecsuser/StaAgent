import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        boolean unreachableCondition = false; // Unreachable condition
        if (b == 0) {
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4; 

        boolean switchCondition;
        boolean unreachableSwitchCondition = false; // Unreachable condition
        switch (i) {
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
                switchCondition = doSomething();
        }

        if(unreachableCondition) { // Unreachable block
            System.out.println("This block of code should not be reachable!");
        }

        if(unreachableSwitchCondition) { // Unreachable block
            System.out.println("This block of code should not be reachable!");
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