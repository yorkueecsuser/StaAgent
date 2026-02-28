class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        boolean conditionWhile = getCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        
        String value = maybeNullString();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }

    private void useNonNullString(String str) {
        // This method requires a non-null string
        System.out.println(str.length());
    }

    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug();
    }
}