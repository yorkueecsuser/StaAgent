import java.util.Arrays;

class BugExample {
    private boolean condition = false;

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
            if(condition) {
                break; // This branch is now unreachable
            }
        }
        return arr;
    }
}