class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        // Mutated code: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            result = "This is reachable";
        } else {
            result = "This is also reachable";
        }
        return result;
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return true; // Always returns true, but the else block is still logically present
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}