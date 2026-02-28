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
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        
        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }
    
    // Method to ensure the condition is evaluated at runtime
    public boolean getCondition() {
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