import java.util.Arrays;

class AssignmentInOperand {
    private boolean unreachableCondition = false;

    public void showBug(int x) {
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
    }

    public int getX() {
        return 3;
    }
}