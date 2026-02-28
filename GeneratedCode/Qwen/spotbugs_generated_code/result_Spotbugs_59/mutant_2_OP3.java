class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        // Mutated code: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            result = "This is unreachable";
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}