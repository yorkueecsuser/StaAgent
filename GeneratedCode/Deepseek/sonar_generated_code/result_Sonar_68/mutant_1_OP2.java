import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) { 
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }
        return true;

        int bValue = a > 12? 4 : 4;  
        return true;

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
        return true;

        return true; // Duplicated return statement
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