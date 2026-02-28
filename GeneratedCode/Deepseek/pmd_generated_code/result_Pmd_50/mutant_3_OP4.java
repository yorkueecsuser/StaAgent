import java.util.Arrays;

class InvalidLogMessageFormatBug {
    public boolean condition = false;

    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
        
        if (condition) { // Added mutant code
            System.out.println("This is an unreachable code mutant");
        } else {
            System.out.println("This is another unreachable code mutant");
        }
    }
}