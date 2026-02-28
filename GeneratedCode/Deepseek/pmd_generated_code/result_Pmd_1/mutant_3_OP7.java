import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        
        // Add unreachable while loop
        boolean unreachable = getCondition();
        while (unreachable) {
            // Infinite loop to ensure the condition is non-final and changes in runtime
        }
    }

    public int getX() {
        return 3;
    }

    public boolean getCondition() {
        // Return false for the unreachable loop condition
        return false;
    }
}