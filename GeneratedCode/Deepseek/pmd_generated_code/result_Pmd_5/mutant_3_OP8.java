import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // Mutated BUG: Renaming loop variable name to 'a'
        for (int a = 0; a < 10; a++) {
            if (a*a <= 25) {
                continue;
            }
            break;
        }
        return arr;
    }
}