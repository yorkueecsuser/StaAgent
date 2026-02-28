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
        
        // Begin of mutant code
        boolean condition = getFalseCondition(); // Ensures the condition is evaluated at runtime
        if (condition) {
            System.out.println("This is an unreachable branch."); // This code will never run
        }
        // End of mutant code

        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }

    private boolean getFalseCondition() {
        return false; // This method ensures the condition is not a compile-time constant
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