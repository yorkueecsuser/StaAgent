import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  // Mutation: Inserting unreachable if branch into a randomly selected basic block in the program
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // Mutation: Inserting unreachable if branch into a randomly selected basic block in the program

        boolean switchCondition;
        switch (i) {  // Mutation: Inserting unreachable if branch into a randomly selected basic block in the program
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