import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        } else {
            // Unreachable while loop start 
            while (false) {
                System.out.println("Unreachable code");
            }
            // Unreachable while loop end
        }
    }

    public int getX() {
        return 3;
    }
}