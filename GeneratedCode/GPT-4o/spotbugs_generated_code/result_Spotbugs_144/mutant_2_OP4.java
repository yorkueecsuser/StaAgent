class TypeQualifierExample {

    public String requireNonNull(String input) {
        if (input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        return input;
    }

    public String provideNullable() {
        return null;
    }

    public String showBug() {
        String nullableString = provideNullable();

        // Begin unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block will never execute.");
        } else {
            System.out.println("This else block will execute.");
        }
        // End unreachable if-else statement

        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        TypeQualifierExample example = new TypeQualifierExample();
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException, as expected due to the bug.");
        }
    }
}