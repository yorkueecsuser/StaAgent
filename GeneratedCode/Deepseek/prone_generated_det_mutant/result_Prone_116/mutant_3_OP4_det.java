import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false && false && true && true && false && true && false && true && true && true && false) {short jfvubncv = -8914;}else{short enzjtzep = 8039;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}