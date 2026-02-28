class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }

            // Unreachable while loop mutation
            boolean conditionWhile = getCondition(); // dynamically determined condition
            while (conditionWhile) {
                // This block is unreachable because conditionWhile is false
                System.out.println("This is an unreachable while loop.");
            }

        } catch (NullPointerException e) {
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return result;
    }

    // Method to provide a runtime determined condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}