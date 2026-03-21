import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if (false && false && false && false && true && false && true && false && false && false && false) {short tvzuadup = -9163;}
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}