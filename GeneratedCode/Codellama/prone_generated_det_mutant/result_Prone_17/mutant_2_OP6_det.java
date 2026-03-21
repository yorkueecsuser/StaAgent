import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        for  (int pgtchnqt = 0; pgtchnqt < 0; pgtchnqt++) {double pdmmnwil = -871913880;}
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}