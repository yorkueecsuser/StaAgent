class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        
        // Inserting an unreachable while loop with a non-final variable condition
        boolean conditionWhile = getUnreachableCondition();
        while(conditionWhile) {
            System.out.println("This is unreachable code");
        }
        
        return "Hello, World!";
    }
    
    // Helper method for unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(boolean returnNull) {
        return getNonNullString(returnNull);
    }

    public static void main(String[] args) {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        // Test case that demonstrates the bug
        System.out.println(example.showBug(true)); // This will cause a NullPointerException in a system that enforces @Nonnull
    }
}