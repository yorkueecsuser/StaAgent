class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Unreachable for loop mutation
            boolean conditionFor = getConditionForLoop();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable due to the condition always being false
            }
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return result;
    }

    // Method to provide a boolean condition for the unreachable for loop
    private boolean getConditionForLoop() {
        return false; // Ensures the loop is unreachable
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}