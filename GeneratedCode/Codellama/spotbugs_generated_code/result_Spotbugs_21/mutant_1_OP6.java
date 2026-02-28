import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
        // START: Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop body is unreachable
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
        // END: Unreachable for loop
    }
}