class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        try {
            // Simulate some operation that might throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            result = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Introducing a benign loop for demonstration purposes
        int i = 0;
        while (i < 1) { // Original while loop
            i++;
        }

        // Equivalent do-while loop mutation
        int j = 0;
        do { // Mutated do-while loop
            j++;
        } while (j < 1);

        return result.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}