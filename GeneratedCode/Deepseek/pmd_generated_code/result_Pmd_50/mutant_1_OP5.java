import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13

        // Mutants
        int unreachableSwitch = 0; // Mutant line 20
        switch (unreachableSwitch) { // Mutant line 21
            default:
                boolean condition = getCondition();
                if (condition) {
                    System.out.println("This is a mutant to avoid unreachable statement error");
                }
                break; // Mutant line 24
        } // Mutant line 25
    }

    private boolean getCondition() {
        return false;
    }
}