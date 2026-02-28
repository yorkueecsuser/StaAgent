import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This while loop is unreachable.");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}