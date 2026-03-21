import java.util.Random;

class JavaAllocNegativeSizeExample {

    public static void main(String[] args) {
        JavaAllocNegativeSizeExample example = new JavaAllocNegativeSizeExample();
        int[] bugResult = example.showBug();
        if (bugResult != null) {
            System.out.println("Array size: " + bugResult.length);
        } else {
            System.out.println("Array creation failed.");
        }
    }
public int [] showBug() {
    Random random = new Random();
    boolean condition = random.nextBoolean();
    int n = condition ? 3 : - 5;
    n = condition ? 3 : - 5;
    if(n > 0){ int [] array = new int [ n ]; return array; } else { int [] array = new int [ n ]; return array; }
}
}