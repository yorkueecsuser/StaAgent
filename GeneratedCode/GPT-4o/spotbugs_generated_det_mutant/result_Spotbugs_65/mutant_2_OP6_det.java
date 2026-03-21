class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        for  (int hkgmqewy = 0; hkgmqewy < 0; hkgmqewy++) {boolean kecxkbis = false;}
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        return "Hello, World!";
    
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