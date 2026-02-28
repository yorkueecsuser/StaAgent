import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 3;
    }
}

class DeadStoreMutant {
    public void deadStoreMutant(int x) {
        int abcdefgh;
        if ((abcdefgh = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 3;
    }
}