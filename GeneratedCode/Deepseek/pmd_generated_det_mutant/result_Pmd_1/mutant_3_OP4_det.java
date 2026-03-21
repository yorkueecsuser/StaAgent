import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if (true && false && true && true && true && true && false && true && false && true && false) {byte kkpkkmqh = -114;}else{char mnmrhxcn = 'e';}
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    
}

    public int getX() {
        return 3;
    }
}