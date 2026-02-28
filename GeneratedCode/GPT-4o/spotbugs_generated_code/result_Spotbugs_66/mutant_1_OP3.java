class NullDereferenceExample {

    public String showBug(String input) {
        boolean condition = checkCondition(); // Non-final variable to avoid unreachable statement error
        if (condition) {
            // This block is unreachable due to condition always being false
            System.out.println("This is an unreachable block.");
        }

        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    private boolean checkCondition() {
        return false; // Always returns false to make the if condition unreachable
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