class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero

        // Adding an unreachable switch statement as a mutation
        // The condition is dynamic, ensuring it doesn't cause compile errors.
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                // Default case to handle other values
                System.out.println("Default case, but unreachableCondition is set to a value not covered above");
                break;
        }

        return result;
    }

    // Method to provide a value for the unreachable switch statement
    private int getUnreachableCondition() {
        // Returning a value that is not covered by any case above to make it unreachable
        return 3;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}