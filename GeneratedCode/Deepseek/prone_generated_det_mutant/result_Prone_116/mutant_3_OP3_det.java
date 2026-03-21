import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (true && true && false && true && false && true && true && false && true && true && false) {float mgclpyua = 127859562;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}