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

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code due to the condition being false at runtime.");
        }
    }

    private boolean getCondition() {
        return false; // This method will always return false, making the else branch unreachable at runtime.
    }
}

class ImmutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("original");
        IncorrectImmutableClass obj = new IncorrectImmutableClass(10, sb);
        obj.showBug();
    }
}