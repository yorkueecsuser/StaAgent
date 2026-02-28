import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            // Mutated Code
            boolean condition = false;
            if (condition) {
                break;
            }
            // end of mutated code
        }
        return arr;
    }
}