import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // Original Line
    }

    public void unreachableCode() {
        int x = 1;
        switch(x) {
            case 0:
                System.out.println("Unreachable");
                break;
            default:
                System.out.println("Reachable");
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        bugExample.unreachableCode(); // Adding unreachable code
    }
}