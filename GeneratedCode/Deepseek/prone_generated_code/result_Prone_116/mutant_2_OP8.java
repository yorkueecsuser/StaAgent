import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    }

    public void renameVariable() {
        char b = 'b';
        System.out.println(Collections.nCopies(10, b)); // Mutant: Renaming
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        bugExample.renameVariable();
    }
}