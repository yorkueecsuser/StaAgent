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

class Mutant {
    public void mutantShowBug(int x) {
        if ((x = getMutantX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getMutantX() {
        return 3;
    }
}