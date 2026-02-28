import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        // Mutation: Adding a dead store variable
        int deadVar = -1;
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 3;
    }
}