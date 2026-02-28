import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        
        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This code is unreachable!");
        }
    }

    public int getX() {
        return 3;
    }
}