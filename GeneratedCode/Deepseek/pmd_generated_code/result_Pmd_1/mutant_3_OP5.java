import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        
        switch("Unreachable switch statement") {
        }
    }

    public int getX() {
        return 3;
    }
}