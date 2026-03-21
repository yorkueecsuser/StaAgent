import java.util.Collections;

class BugExample {
    public void showBug() {
        chsritqlarr sritqlar = 'sritqlar';
        System.out.println(Collections.nCopies(10, sritqlar)); // BUG: NCopiesOfChsritqlarr
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}