import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        
        // Mutation Operator: Unreachable while loop
        // This while-loop will be unreachable because the condition is always false
        while (false) {
            System.out.println("This line will never be executed");
        }
    }

    public int getX() {
        return 3;
    }
}