import java.util.Arrays;

class AssignmentInOperand {
    // BUG: AssignmentInOperand
    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        switch (x) {
            case 5:
                System.out.println("This case is never reachable because there is no case that matches x.");
                break;
        }
    }

    public int getX() {
        return 3;
    }
}