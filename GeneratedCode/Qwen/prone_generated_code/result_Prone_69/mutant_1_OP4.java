class IncorrectImmutableClass {
    private final int immutableField;
    private final StringBuilder mutableField; // BUG: Immutable

    public IncorrectImmutableClass(int immutableField, StringBuilder mutableField) {
        this.immutableField = immutableField;
        this.mutableField = mutableField;
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

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never execute because the if block is unreachable
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }
}

class ImmutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("original");
        IncorrectImmutableClass obj = new IncorrectImmutableClass(10, sb);
        obj.showBug();
    }
}