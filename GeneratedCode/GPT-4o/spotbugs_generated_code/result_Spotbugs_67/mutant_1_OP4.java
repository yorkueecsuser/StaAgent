class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Unreachable if-else branch inserted here
            boolean condition = alwaysFalse();
            if (condition) {
                result = "This will never happen";
            } else {
                // Value of result is guaranteed to be null when a NullPointerException is caught
                return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
            }
        }
        return result;
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}