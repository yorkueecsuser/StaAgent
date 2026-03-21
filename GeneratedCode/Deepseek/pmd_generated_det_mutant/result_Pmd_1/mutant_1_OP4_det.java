import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if (true && false && true && true && true && true && false && false && false && false && false) {int vmpbuovs = -641650987;}else{short mjneoeas = 7551;}
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}