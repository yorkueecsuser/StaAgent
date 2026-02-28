import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;

        boolean switchCondition;
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

        // Mutation Operator: Unreachable while loop
        while(false) {
            System.out.println("This while loop is unreachable, added by Mutation Testing");
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