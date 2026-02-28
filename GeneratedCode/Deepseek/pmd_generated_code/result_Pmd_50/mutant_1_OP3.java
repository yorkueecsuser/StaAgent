import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        if(false) { System.out.println("Dead Code"); } // Mutation line 15
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        if(false) { System.out.println("Dead Code"); } // Mutation line 16
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
        if(false) { System.out.println("Dead Code"); } // Mutation line 17
    }
}