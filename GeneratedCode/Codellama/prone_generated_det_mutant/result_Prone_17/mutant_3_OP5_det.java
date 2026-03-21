import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        int ybjudjgy = 0;switch  (ybjudjgy) {case 1:byte oplzvkze = -1;break;default:byte qehmhlpc = 60;break;}
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}