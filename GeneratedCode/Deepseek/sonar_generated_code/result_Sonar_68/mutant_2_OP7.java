import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  
            condition = doOneMoreThing();
        } else {
            boolean alwaysFalse = false;
            while(alwaysFalse) {} // Unreachable while loop mutant
            condition = doOneMoreThing();
        }

        int bValue;
        if (a > 12) {
            bValue = 4;
        } else {
            boolean alwaysFalse2 = false;
            while(alwaysFalse2) {} // Unreachable while loop mutant
            bValue = 4;
        }

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
                boolean alwaysFalse3 = false;
                while(alwaysFalse3) {} // Unreachable while loop mutant
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