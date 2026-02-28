import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false) {
            System.out.println(Collections.nCopies(10, a)); // Unreachable statement
        } else {
            System.out.println("This statement is unreachable");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}