import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        if (false && true && true && true && false && false && true && false && false && true && false) {short hssgwpue = 8700;}else{String ukphmdvq = "ivgnyfnl";}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}