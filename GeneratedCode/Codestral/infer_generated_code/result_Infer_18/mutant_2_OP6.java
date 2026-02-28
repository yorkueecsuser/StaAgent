import java.lang.annotation.*;

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

        // Inserted unreachable for loop as per the mutation operator
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should not be executed.");
        }

        int[] tempArray = new int[size];

        System.out.println("Result: " + result + ", Array size: " + size);
    }
}