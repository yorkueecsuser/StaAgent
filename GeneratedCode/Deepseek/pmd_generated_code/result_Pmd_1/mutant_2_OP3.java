import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant: Unreachable if statement
        if (getX() == 4) {
            System.out.println("This if statement is unreachable as it will never be executed!");
        }
    }

    public int getX() {
        return 3;
    }
}