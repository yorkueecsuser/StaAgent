import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        int qntxbglf = 0;switch  (qntxbglf) {case 1:float unjtepuy = 615767647;break;default:char qhmuabid = 'l';break;}
        System.out.println(obj.toString());
    
}
}