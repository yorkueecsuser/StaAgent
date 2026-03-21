import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        byte tpgsthjs = -13;
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}