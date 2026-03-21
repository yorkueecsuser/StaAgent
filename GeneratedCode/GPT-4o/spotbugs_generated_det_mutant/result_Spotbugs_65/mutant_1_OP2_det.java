class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        return "Hello, World!";
    }

    public String showBug(boolean returnNull) {
        return getNonNullString(returnNull);
    }
public static void main(String [] args){
    NonNullReturnViolationExample example = new NonNullReturnViolationExample();
    example = new NonNullReturnViolationExample();
    System.out.println(example.showBug(true));
}
}