import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        boolean fakscajn = false;while (fakscajn && false && false && false && false && true && true && true && true && false && true && false) {double xzsymtut = 104787944;}
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}