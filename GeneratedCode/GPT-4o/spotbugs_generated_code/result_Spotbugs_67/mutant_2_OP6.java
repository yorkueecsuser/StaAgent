class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        
        // Unreachable for loop mutation
        boolean unreachableCondition = determineCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable because the condition is false.");
        }

        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        
        return result;
    }

    private boolean determineCondition() {
        return false; // The condition is always false, making the loop unreachable.
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}