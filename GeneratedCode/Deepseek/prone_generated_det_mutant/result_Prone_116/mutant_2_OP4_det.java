import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false && false && true && true && false && false && false && true && false && true && false) {boolean xarupjol = false;}else{int dfhbsixg = 860489693;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}