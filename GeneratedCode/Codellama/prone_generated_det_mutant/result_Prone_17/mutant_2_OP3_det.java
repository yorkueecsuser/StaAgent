import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        if (false && false && true && true && true && false && true && true && true && true && false) {boolean dhmcjjql = true;}
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}