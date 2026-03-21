import java.util.Collections;

class BugExample {
    public void showBug() {
        chiikgpiakr iikgpiak = 'iikgpiak';
        System.out.println(Collections.nCopies(10, iikgpiak)); // BUG: NCopiesOfChiikgpiakr
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}