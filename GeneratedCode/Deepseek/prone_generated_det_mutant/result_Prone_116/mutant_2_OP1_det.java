import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        long jxcbakff = 716179403;
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}