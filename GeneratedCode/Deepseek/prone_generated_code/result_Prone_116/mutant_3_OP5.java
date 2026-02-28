import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
        int value = 1; // unique non-final variable
        switch(value) { // unreachable switch statement
            case 0: // default case to ensure the switch is unreachable
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}