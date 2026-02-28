import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public void mutant1() {
        char b = 'b';
        System.out.println(Collections.nCopies(10, b)); // Mutation: Renaming variable 'a' to 'b'
    }
}