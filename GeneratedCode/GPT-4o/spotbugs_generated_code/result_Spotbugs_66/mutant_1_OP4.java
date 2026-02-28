class NullDereferenceExample {

    public String showBug(String input) {
        // Unreachable if-else statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable code.");
        }
        
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    // Method to dynamically determine false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}