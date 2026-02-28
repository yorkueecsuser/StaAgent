import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
    }
}
// Rename variable "value" to "x"
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int x : values) {
            int result = Math.min(0, Math.max(100, x));
            System.out.println(result);
        }
    }
}