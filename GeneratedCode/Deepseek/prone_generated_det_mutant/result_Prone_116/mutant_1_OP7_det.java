import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        boolean wdldlnlm = false;while (wdldlnlm && false && true && false && true && false && true && true && false && false && false && false) {char ruladrgj = 'd';}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}