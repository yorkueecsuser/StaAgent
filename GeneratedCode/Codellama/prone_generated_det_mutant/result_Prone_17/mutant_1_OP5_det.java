import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        int yxxggvvz = 0;switch  (yxxggvvz) {case 1:double cocoeiqa = -918013637;break;default:boolean uuhyokvk = false;break;}
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    
}
}