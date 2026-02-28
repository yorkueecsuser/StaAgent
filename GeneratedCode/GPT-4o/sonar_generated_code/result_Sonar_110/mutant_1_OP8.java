class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
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
    }
}

// Mutation using Renaming Operator
class NullPointerExampleMutant {

    public String showBug(String x) { // Renamed 'input' to 'x'
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'x' is null
        String result = x.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
    }

    public static void main(String[] args) {
        NullPointerExampleMutant exampleMutant = new NullPointerExampleMutant();

        try {
            // Demonstrating the bug by passing a null value
            String output = exampleMutant.showBug(null);
            System.out.println("Output: " + output);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}