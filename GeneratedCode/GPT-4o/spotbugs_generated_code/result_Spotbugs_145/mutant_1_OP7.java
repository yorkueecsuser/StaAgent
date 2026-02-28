class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = maybeNullString();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable");
        }
    }

    private void useNonNullString(String str) {
        // This method requires a non-null string
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug();
    }

    // Helper method to provide a non-final variable condition for the while loop
    private boolean getCondition() {
        return false; // This makes the while loop condition always false at runtime
    }
}