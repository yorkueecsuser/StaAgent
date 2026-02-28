import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        } else {
            // Unreachable statement
            System.out.println("Unreachable");
        }
    }

    public int getX() {
        return 3;
    }
}