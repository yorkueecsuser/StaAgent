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
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] arr = new int[10];
        // Unreachable while loop mutation starts here
        boolean condition = false;
        while (condition) {
            System.out.println("This will never be printed");
        }
        // Unreachable while loop mutation ends here
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}