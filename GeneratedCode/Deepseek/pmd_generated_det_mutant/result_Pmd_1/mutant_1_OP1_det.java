import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        boolean zbmlrreh = false;
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}