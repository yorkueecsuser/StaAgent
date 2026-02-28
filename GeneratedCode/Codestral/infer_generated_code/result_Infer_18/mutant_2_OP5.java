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

    public boolean getCondition() {
        return false;
    }

    @Expensive
    public void showBug() {
        int limit = Integer.MAX_VALUE - 10;
        int increment = 15;
        int result = limit + increment;

        // Use in array allocation with potential negative size
        int size = result % 50;
        int[] tempArray = new int[size];

        System.out.println("Result: " + result + ", Array size: " + size);

        // Added mutant unreachable switch statement
        if(getCondition()) {
            int value = 0;
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is unreachable code.");
                    break;
            }
        }
    }
}