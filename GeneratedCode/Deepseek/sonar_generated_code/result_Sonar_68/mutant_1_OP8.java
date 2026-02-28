import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  // Mutation: Renaming variable 'b' to 'bMutant'
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // Mutation: Renaming variable 'bValue' to 'bValueMutant'

        boolean switchCondition;
        switch (i) {  // Mutation: Renaming variable 'i' to 'iMutant'
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