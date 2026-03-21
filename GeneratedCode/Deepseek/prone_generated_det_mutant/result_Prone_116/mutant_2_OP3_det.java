import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false && false && false && true && false && false && true && false && true && true && false) {char yzsqrabc = 'c';}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}