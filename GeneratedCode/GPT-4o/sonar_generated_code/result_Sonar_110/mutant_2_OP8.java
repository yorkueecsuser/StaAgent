class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
    }

    // Renamed 'example' to 'a' as per the mutation operator
    public static void main(String[] args) {
        NullPointerExample a = new NullPointerExample();

        try {
            // Demonstrating the bug by passing a null value
            String output = a.showBug(null);
            System.out.println("Output: " + output);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}