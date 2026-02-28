class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean a) {
        if (a) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        return "Hello, World!";
    }

    public String showBug(boolean returnNull) {
        return getNonNullString(returnNull);
    }

    public static void main(String[] args) {
        NonNullReturnViolationExample b = new NonNullReturnViolationExample();
        // Test case that demonstrates the bug
        System.out.println(b.showBug(true)); // This will cause a NullPointerException in a system that enforces @Nonnull
    }
}