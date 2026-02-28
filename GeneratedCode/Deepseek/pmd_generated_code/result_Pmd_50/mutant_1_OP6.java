import java.util.Arrays;

class InvalidLogMessageFormatBug {
    private boolean getCondition() {
        return false; 
    }

    private String getString(String s){
        return s; 
    }

    private IllegalStateException getException(String s){
        return new IllegalStateException(s);
    }

    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13

        // Mutation Operator: Unreachable For Loop
        for (int i = 0; getCondition(); i++) {
            // Empty body
        }
    }
}