import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        short yclrgwmp = -4552;
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}