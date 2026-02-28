import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        // Mutation: Unreachable if-else statement
        if (false) {
            System.out.println("This statement will never be executed");
        }
    }

    public int getX() {
        return 3;
    }
}