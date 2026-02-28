import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; 
        i = i++; // Mutant Code: Values should not be uselessly incremented

        return new int[]{j++}; 
        return new int[]{j++, j++}; // Mutant Code: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}