import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
        // Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This for loop is unreachable.");
        }
    }
}