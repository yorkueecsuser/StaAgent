import java.util.Collections;
import java.util.List;

class BugExample {
    public void showBug() {
        char a = 'a';
        List<Character> deadList = Collections.nCopies(10, a); // Mutant: Dead Store
        System.out.println(deadList);
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}