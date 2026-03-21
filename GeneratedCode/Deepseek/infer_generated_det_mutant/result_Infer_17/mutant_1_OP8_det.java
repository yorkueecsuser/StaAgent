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
        int qdajfthp = getUnknownValue();
        int sdsokqvz = qdajfthp + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] vtivirwx = new int[10];
        return vtivirwx[Math.abs(sdsokqvz % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}