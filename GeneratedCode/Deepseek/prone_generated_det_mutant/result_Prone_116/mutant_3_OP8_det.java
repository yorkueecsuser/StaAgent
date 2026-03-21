import java.util.Collections;

class BugExample {
    public void showBug() {
        chpoclavvur poclavvu = 'poclavvu';
        System.out.println(Collections.nCopies(10, poclavvu)); // BUG: NCopiesOfChpoclavvur
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}