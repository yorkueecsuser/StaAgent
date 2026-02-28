import java.lang.System;

class DuplicateBranchesBug {
    public boolean showBug(int b, int i, int a) {
        boolean condition;
        if (b == 0) {  // Mutation: Adding unused variable declarations with one primitive type
            String unusedVariable1 = "abcdefgh";
            condition = doOneMoreThing();
        } else {
            String unusedVariable2 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type
            condition = doOneMoreThing();
        }

        int bValue = a > 12? 4 : 4;  // Mutation: Adding unused variable declarations with one primitive type
        String unusedVariable3 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type

        boolean switchCondition;
        switch (i) {  // Mutation: Adding unused variable declarations with one primitive type
            case 1:
                String unusedVariable4 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type
                switchCondition = doSomething();
                break;
            case 2:
                String unusedVariable5 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type
                switchCondition = doSomething();
                break;
            case 3:
                String unusedVariable6 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type
                switchCondition = doSomething();
                break;
            default:
                String unusedVariable7 = "abcdefgh"; // Mutation: Adding unused variable declarations with one primitive type
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