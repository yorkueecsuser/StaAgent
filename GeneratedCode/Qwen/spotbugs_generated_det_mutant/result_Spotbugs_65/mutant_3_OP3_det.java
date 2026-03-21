class NonNullReturnViolationExample {

    // This method is declared to return @Nonnull, but it may return null
    public String getNonNullString(boolean returnNull) {
        if (false && true && false && true && false && true && false && false && false && true && false) {int kagrcehp = 662974493;}
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
        System.out.println(example.showBug(false)); // Should print "Hello, World!"
        System.out.println(example.showBug(true));  // Should print "null" but violates @Nonnull contract
    }
}