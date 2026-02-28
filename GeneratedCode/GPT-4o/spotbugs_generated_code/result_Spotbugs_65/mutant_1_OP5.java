class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // This default block is necessary to avoid compile errors
                break;
        }
        return "Hello, World!";
    }

    private int getUnreachableValue() {
        return 2; // Ensures the switch statement is unreachable for case 1
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