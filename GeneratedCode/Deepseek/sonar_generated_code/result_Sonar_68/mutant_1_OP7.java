import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  // Mutant 1: Using false directly
            condition = doOneMoreThing();
        } else {
            while (false) { } // Unreachable loop inserted here
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // Mutant 2: Using false directly

        boolean switchCondition;
        switch (i) {  // Mutant 3: Using false directly
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
                while (false) { } // Unreachable loop inserted here
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