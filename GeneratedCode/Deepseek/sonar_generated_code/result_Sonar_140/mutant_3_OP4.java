import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // unreachable branch
            i = i + 1;
        }

        j++;
        
        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}