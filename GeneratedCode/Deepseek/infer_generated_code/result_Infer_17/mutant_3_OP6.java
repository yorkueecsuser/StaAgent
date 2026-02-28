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
        int y = x + 2000000000;
        int[] arr = new int[10];
        boolean condition = getCondition();
        if (condition) {
            // This is a randomly generated unreachable for loop.
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }

    // This is a helper method to generate a random boolean value.
    private boolean getCondition() {
        return (System.currentTimeMillis() % 2) == 0;
    }
}