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
        
        // Introduce an unreachable if-else statement
        boolean condition = getCondition(); // This method is assumed to return false
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        } else {
            System.out.println("This else block is executed instead.");
        }
        
        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }
    
    // Helper method to demonstrate the mutation operator
    private boolean getCondition() {
        return false; // Ensuring the condition is always false
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