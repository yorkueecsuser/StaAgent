import java.lang.Math;

class MathRoundIntLongBug {
    private boolean condition = false;

    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2);
    }

    // Generated mutated Java code
    private void unreachableSwitchStatementMutant() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Mutant Code");
                break;
        }
    }

    // Helper method to simulate non-final variable
    private int getValue() {
        return condition? 0 : 1;
    }
}