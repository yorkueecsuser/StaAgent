class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = maybeNullString();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        
        // Mutation: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        }
    }

    private boolean getFalseCondition() {
        // This method returns false, making the if condition effectively unreachable
        return false;
    }

    private void useNonNullString(String str) {
        // This method requires a non-null string
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug();
    }
}