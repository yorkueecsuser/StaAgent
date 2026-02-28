class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced

        // Inserted unreachable switch statement
        int unreachableValue = -1; // A value that won't match any case
        switch(unreachableValue) {
            case 0:
                System.out.println("This is case 0.");
                break;
            case 1:
                System.out.println("This is case 1.");
                break;
            default:
                System.out.println("Unreachable default case.");
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
}