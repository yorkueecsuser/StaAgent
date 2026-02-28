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
        
        // Inserting an unreachable switch statement with a condition that will always evaluate to false
        int unreachableCondition = getUnreachableCondition(); // Using a method to simulate the condition
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                System.out.println("Nor this.");
                break;
        }
        
        return requireNonNull(nullableString); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }

    // Method to simulate a condition that makes the switch case unreachable
    public int getUnreachableCondition() {
        return 0; // Always returns 0, which does not match any case
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