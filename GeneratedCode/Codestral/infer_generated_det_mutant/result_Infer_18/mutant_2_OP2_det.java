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
@ Expensive public void showBug() {
    int limit = Integer.MAX_VALUE - 10;
    limit = Integer.MAX_VALUE - 10;
    int increment = 15;
    int result = limit + increment;
    int size = result % 50;
    int [] tempArray = new int [ size ];
    System.out.println("Result: " + result + ", Array size: " + size);
}
}