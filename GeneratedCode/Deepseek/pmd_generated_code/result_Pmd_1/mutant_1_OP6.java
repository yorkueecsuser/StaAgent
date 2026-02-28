import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant code: unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Non-reaching code
            System.out.println("This is mutant code - unreachable for loop");
        }
    }

    public int getX() {
        return 3;
    }

    public boolean getCondition() {
        return false;
    }
}