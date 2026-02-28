class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        
        // Mutated code: Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute because shouldRun is always false
            result = "This will never be reached";
        } else {
            // This block will always execute
            result = "Always executed block";
        }
        
        return result;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}