class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = maybeNullString();
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)

        boolean condition = Math.random() > 1; // This will always be false since Math.random() generates values between 0.0 and 1.0
        if (condition) {
            System.out.println("This is an unreachable block.");
        } else {
            // This else part is reachable but does nothing to affect the code
            System.out.println("Condition was false.");
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
}