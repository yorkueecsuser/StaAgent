import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int a = 0;
        int b = 0;

        a = a++; // MUTANT: Values should not be uselessly incremented

        return new int[]{b++}; // MUTANT: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}