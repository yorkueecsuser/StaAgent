import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        boolean uuzcunlp = false;while (uuzcunlp && false && true && true && false && false && true && true && true && false && true && false) {String wiizwdzu = "hwswjqep";}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}