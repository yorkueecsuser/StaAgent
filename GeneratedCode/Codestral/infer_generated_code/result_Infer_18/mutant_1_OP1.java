import java.lang.annotation.*;
import java.util.Random;

// Custom annotation used for static analysis
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface Expensive { }

class JavaAllocNegativeSizeExample {
    public static void main(String[] args) {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        example.showBug();
    }

    @Expensive
    public void showBug() {
        int limit = Integer.MAX_VALUE - 10;
        int increment = 15;
        int result = limit + increment;

        // Use in array allocation with potential negative size
        int size = result % 50; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE

        // Dead Store Mutation: Adding an unused variable declaration
        char deadVariable = generateRandomChar();

        int[] tempArray = new int[size];

        System.out.println("Result: " + result + ", Array size: " + size + ", Dead Variable: " + deadVariable);
    }

    // Method to generate a random character
    private char generateRandomChar() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }
}