import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;
        String s = "xxxxxxxx"; // Added dead store

        i = i++; 

        return new int[]{j++}; 
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}