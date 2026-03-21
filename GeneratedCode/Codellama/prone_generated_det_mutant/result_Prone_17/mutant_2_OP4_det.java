import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        if (true && true && true && true && false && true && false && false && false && false && false) {float vssghxwa = -42116444;}else{double zuejyqqs = -354735569;}
        System.out.println(obj.toString());
    
}
}