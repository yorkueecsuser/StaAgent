import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
        
        // Unreachable if-else statement mutant
        if (1!= 1) {
            System.out.println("This is an unreachable if-else statement mutant.");
        } else {
            // This branch is unreachable and will never be executed.
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}