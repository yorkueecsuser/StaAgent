import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}