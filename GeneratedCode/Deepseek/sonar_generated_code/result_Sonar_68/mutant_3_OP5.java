import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == getZero()) {  // Mutation: All branches in a conditional structure should not have exactly the same implementation
            condition = doOneMoreThing();
        } else {
            condition = doOneMoreThing();
        }

        int bValue = a > getThirteen()? 4 : 4;  // Mutation: All branches in a conditional structure should not have exactly the same implementation

        boolean switchCondition;
        switch (i) {  // Mutation: All branches in a conditional structure should not have exactly the same implementation
            case getOne():
                switchCondition = doSomething();
                break;
            case getTwo():
                switchCondition = doSomething();
                break;
            case getThree():
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

    private int getZero() {
        return 0;
    }

    private int getOne() {
        return 1;
    }

    private int getTwo() {
        return 2;
    }

    private int getThree() {
        return 3;
    }

    private int getThirteen() {
        return 13;
    }
}