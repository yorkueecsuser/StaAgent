import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // MUTANT: Unreachable switch statement (Line 18)
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            switch (i) { // unreachable switch statement added
                case 10:
                    break;
            }
        }
        return arr;
    }
}