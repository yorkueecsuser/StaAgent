class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        
        // Unreachable if-else statement mutant
        boolean shouldExecute = getDynamicCondition(); // Use a non-final variable
        if (shouldExecute) {
            System.out.println("This will never be printed because shouldExecute is always false");
        } else {
            System.out.println("This else block is reachable and will be executed.");
        }

        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to simulate a dynamic condition
    private static boolean getDynamicCondition() {
        return false;
    }
}