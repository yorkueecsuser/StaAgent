import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        String a1234567 = "forget the arg {}"; // Mutant line 10
        System.out.println("forget the arg {}"); // Bug line 10
        String b1234567 = "forget the arg %s"; // Mutant line 11
        System.out.println("forget the arg %s"); // Bug line 11
        String c1234567 = "too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"}); // Mutant line 12
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        String d1234567 = "param {} " + "arg1" + new IllegalStateException("arg"); // Mutant line 13
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    }
}