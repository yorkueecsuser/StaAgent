import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    }

    public void addMutant() {
        // Mutation Operator: Unreachable switch statement
        boolean falseCondition = false; // False condition for the switch statement
        switch (falseCondition? 1 : 0) { // Unreachable switch statement
            case 0:
                System.out.println("This code will never be executed");
                break;
            default:
                System.out.println("Default case will also never be executed");
        }
    }
}