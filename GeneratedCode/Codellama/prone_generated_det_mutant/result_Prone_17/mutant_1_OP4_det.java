import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        if (true && false && true && false && true && true && true && false && false && false && false) {String insgissb = "hduxundt";}else{byte flyulmfg = 50;}
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}