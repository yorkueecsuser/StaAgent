import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];

        boolean exitLoop = false;
        while(true) {
            exitLoop = false;
            for (int i = 0; i < 10; i++) {
                if (i*i <= 25) {
                    continue;
                }
                exitLoop = true;
                break;
            }
            if (!exitLoop) {
                break;
            }
        }

        return arr;
    }
}