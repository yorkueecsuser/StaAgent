class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        
        // Inserting an unreachable switch statement
        int unreachableVariable = getUnreachableValue();
        switch (unreachableVariable) {
            case 999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // Intentionally left empty
                break;
        }

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
    
    // Method to simulate dynamic evaluation of the switch condition
    private int getUnreachableValue() {
        return 1000; // Always returns a value not covered by any switch case
    }
}