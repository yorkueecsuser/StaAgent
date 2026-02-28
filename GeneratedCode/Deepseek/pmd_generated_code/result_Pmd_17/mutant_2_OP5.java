import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public void unreachableSwitchStatement() {
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Value is 1");
                    break;
            }
        }
    }
}