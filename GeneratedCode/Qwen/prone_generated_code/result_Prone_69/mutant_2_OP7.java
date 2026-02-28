class IncorrectImmutableClass {
    private final int immutableField;
    private final StringBuilder mutableField; // BUG: Immutable

    public IncorrectImmutableClass(int immutableField, StringBuilder mutableField) {
        this.immutableField = immutableField;
        this.mutableField = mutableField;

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This is an unreachable loop.");
        }
    }

    public int getImmutableField() {
        return immutableField;
    }

    public StringBuilder getMutableField() {
        return mutableField;
    }

    public void showBug() {
        // Demonstrating the bug by modifying the mutable field
        mutableField.append(" modified");
        System.out.println("Mutable field after modification: " + mutableField.toString());

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This is another unreachable loop.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the loops are unreachable
        return false;
    }
}

class ImmutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("original");
        IncorrectImmutableClass obj = new IncorrectImmutableClass(10, sb);
        obj.showBug();

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = obj.getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("Yet another unreachable loop.");
        }
    }
}