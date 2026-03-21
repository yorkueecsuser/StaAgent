import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface YourAnnotationName {}

@YourAnnotationName
class IntegerOverL2 {
    public static int getUnknownValue() {
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        for  (int sitbrkfs = 0; sitbrkfs < 0; sitbrkfs++) {int tusipnts = 18275013;}
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    
}

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}