import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        String x = "forget the arg {}";
        System.out.println(x); // Bug line 10
        String y = "forget the arg %s";
        System.out.println(y); // Bug line 11
        String z = "too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"});
        System.out.println(z); // Bug line 12
        String a = "param {} " + "arg1" + new IllegalStateException("arg");
        System.out.println(a); // Bug line 13
    }
}