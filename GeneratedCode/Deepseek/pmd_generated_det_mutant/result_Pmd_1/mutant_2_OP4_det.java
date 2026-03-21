import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if (true && false && false && true && true && false && false && true && true && false && false) {long oqmjmekj = -180213231;}else{boolean cohnqski = true;}
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}