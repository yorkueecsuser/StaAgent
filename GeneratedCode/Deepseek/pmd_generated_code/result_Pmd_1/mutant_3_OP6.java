import java.util.Arrays;

class AssignmentInOperand {
    private boolean unreachableForLoop() {
        int i = 0;
        boolean condition = false;
        while(i < 10) {
            i++;
        }
        return condition;
    }
   
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Unreachable for loop mutant
        if (unreachableForLoop()) {
            System.out.println("Unreachable for loop!");
        }
    }

    public int getX() {
        return 3;
    }
}