import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant Code: Unreachable for loop
        for(int i=0; false; i++) {
            // Do nothing
        }
    }

    public int getX() {
        return 3;
    }
}