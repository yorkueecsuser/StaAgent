import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;
        boolean condition = false;

        i = i++; 

        condition = getCondition();
        if (condition) {
            for (int k = 0; k < 10; k++) {
                // unreachable code
            }
        }

        return new int[]{j++};
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }

    private boolean getCondition() {
        // mutants cannot infer the value of this method
        return false;
    }
}