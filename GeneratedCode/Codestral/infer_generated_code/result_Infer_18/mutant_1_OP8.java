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
        int finalResult = limit + increment;

        // Use in array allocation with potential negative size
        int arraySize = finalResult % 50; // Renamed'size' to 'arraySize'
        int[] tempArray = new int[arraySize];

        System.out.println("Result: " + finalResult + ", Array size: " + arraySize);
    }
}