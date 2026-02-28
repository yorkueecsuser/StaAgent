import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); 

        // Mutant Code: Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                break;
            case false:
                break; // Unreachable code
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    // Method that always returns false
    public boolean getCondition() {
        return false;
    }
}