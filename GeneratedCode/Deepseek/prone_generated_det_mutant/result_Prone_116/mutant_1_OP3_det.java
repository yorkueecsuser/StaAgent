import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false && true && false && false && false && true && true && true && false && false && false) {double fyipmpvf = 399562769;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}