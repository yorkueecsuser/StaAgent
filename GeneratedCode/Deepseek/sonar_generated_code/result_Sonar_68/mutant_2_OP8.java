import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) { 
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing_Mutant1();  // Mutation: Renaming
        }

        int bValue = a > 12? 4 : 4;  // Mutation: Renaming
        int bValue_Mutant2 = 5;

        boolean switchCondition;
        switch (i) {
            case 1:
                switchCondition = doSomething();
                break;
            case 2:
                switchCondition = doSomething();
                break;
            case 3:
                switchCondition = doSomething_Mutant3();  // Mutation: Renaming
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

    private boolean doOneMoreThing_Mutant1() {  // Mutation: Renaming
        System.out.println("Doing one more thing");
        return true;
    }

    private boolean doSomething() {
        System.out.println("Doing something");
        return true;
    }

    private boolean doSomething_Mutant3() {  // Mutation: Renaming
        System.out.println("Doing something");
        return true;
    }
}