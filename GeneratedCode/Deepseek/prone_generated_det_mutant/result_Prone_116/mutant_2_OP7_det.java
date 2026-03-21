import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        boolean ntucrpgw = false;while (ntucrpgw && true && true && false && true && true && true && true && true && true && false && false) {byte gdzonbqy = -26;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}