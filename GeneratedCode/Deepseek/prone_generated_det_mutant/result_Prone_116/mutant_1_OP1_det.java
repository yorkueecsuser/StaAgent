import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        float ozykoyiu = -440219184;
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}