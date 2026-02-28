class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
    }

    public String showBugMutant(String a) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'a' is null
        String b = a.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return b;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();

        try {
            // Demonstrating the bug by passing a null value
            String output = example.showBug(null);
            System.out.println("Output: " + output);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        try {
            // Demonstrating the bug with the mutant method by passing a null value
            String outputMutant = example.showBugMutant(null);
            System.out.println("Output (Mutant): " + outputMutant);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException in mutant: " + e.getMessage());
        }
    }
}