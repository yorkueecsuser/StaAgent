import java.lang.annotation.*;
import com.facebook.infer.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@interface YourAnnotationName {}

class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        int[] tempArray = new int[Math.abs(50)];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i + j > 0) {
                    int result = 10;

                    // Use in array allocation
                    int size = Math.abs(result) % 50;
                    tempArray = new int[size];

                    System.out.println("Result: " + result + ", Array size: " + size);
                }
            }
        }

        // Unreachable switch statement
        switch (false) {
            case 1:
                System.out.println("Unreachable code");
                break;
            case 2:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}