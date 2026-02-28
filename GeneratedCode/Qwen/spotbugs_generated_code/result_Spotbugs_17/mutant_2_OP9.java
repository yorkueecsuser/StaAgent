class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        // Introducing a benign loop for demonstration purposes
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Mutating the benign loop using Equivalent Loop Replacement
        i = 0;
        do {
            i++;
        } while (i < 1);

        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}