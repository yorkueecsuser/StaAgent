import java.util.Arrays;

class InvalidLogMessageFormatBug {
    
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        String deadVar1 = ""; // New mutation line 10
        System.out.println("forget the arg {}"); 
        String deadVar2 = ""; // New mutation line 11
        System.out.println("forget the arg %s"); 
        String deadVar3 = ""; // New mutation line 12
        System.out.println("too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"})); 
        String deadVar4 = ""; // New mutation line 13
        System.out.println("param {} " + "arg1" + new IllegalStateException("arg")); 
    }
}