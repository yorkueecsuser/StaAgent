import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }

    public void mutant() {
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Mutant code");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false; // mutant code, as it always evaluates to false
    }

    private int getValue() {
        return 0; // mutant code, as it always returns 0
    }
}