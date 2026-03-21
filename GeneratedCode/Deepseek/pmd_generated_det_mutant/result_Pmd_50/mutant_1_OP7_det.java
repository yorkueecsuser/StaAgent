import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        boolean tpznbgfq = false;while (tpznbgfq && true && true && false && true && true && true && true && false && true && true && false) {char zxwzrdjj = 'm';}
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    
}
}