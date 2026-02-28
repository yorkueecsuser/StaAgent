import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int y) {
        if ((y = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 3;
    }
}