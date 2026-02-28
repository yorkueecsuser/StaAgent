class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean b) { // Renamed the parameter 'returnNull' to 'b'
        if (b) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        return "Hello, World!";
    }

    public String showBug(boolean flag) { // Renamed the parameter 'returnNull' to 'flag'
        return getNonNullString(flag);
    }

    public static void main(String[] args) {
        NonNullReturnViolationExample e = new NonNullReturnViolationExample(); // Renamed the variable 'example' to 'e'
        // Test case that demonstrates the bug
        System.out.println(e.showBug(true)); // This will cause a NullPointerException in a system that enforces @Nonnull
    }
}