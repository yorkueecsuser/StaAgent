import java.util.Arrays;

class InvalidLogMessageFormatBug {

    private int getInt() {
        return 4;
    }

    private boolean getCondition() {
        return false;
    }

    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13

        // Mutated Code: Unreachable switch statement
        boolean condition = getCondition();
        while(condition) {
            int value = getInt();
            switch (value) {
                case 1:
                    System.out.println("This is a mutated code");
                    break;
                default:
                    System.out.println("This is a mutant code");
            }
            break;
        }
    }
}