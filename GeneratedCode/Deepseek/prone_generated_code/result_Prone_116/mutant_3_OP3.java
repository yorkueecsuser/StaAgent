import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false) {
            System.out.println("Unreachable code");
        }
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}