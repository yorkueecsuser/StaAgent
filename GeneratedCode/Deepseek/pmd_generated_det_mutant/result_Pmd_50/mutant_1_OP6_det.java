import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        for  (int dzzzfpbq = 0; dzzzfpbq < 0; dzzzfpbq++) {long dwbitfwr = 788912092;}
        System.out.println("forget the arg {}"); // Bug line 10
        System.out.println("forget the arg %s"); // Bug line 11
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); // Bug line 12
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); // Bug line 13
    
}
}