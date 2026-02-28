class NullPointerExample {

    public String showBug(String input) {
        // Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }

        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
    }

    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
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