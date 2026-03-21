import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        for  (int myzunkib = 0; myzunkib < 0; myzunkib++) {double znirknrf = -94726778;}
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}