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
        }

        // Added loop for mutation purposes
        int i = 0;
        while (i < 1) {
            i++;
        }

        return result.toLowerCase(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
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