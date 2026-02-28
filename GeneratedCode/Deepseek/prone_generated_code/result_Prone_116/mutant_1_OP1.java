import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        String mutant = "mutant"; // mutant variable
        System.out.println(Collections.nCopies(10, a)); 
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}