import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        if (false && false && true && false && true && false && false && false && false && false && false) {String jtypikxn = "nvlqxqoh";}else{char pksrkffb = 'b';}
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}