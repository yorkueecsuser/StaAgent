import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        char a1 = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}