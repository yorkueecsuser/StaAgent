class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate a condition that always throws an exception
            if (input.equals("test")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // Intentionally not setting result to any value, so it remains null

            // Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() always returns false
                System.out.println("This loop should never execute");
            }
        }
        return result.toLowerCase(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug("test");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}