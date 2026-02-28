import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 3;
    }
}

class AssignmentInOperandMutant {
    // Mutant: Unreachable if statement
    public void showBugMutant(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        } else {
            System.out.println("Unreachable code");
        }
    }

    public int getX() {
        return 3;
    }
}