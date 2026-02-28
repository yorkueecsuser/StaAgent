class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        
        // Mutation: Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Non-final method call
        switch (unreachableValue) {
            case 100:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case won't execute because getUnreachableValue() returns 0
                System.out.println("Default unreachable case.");
                break;
        }

        return String.valueOf(result);
    }

    private int getUnreachableValue() {
        return 0; // Returning a value that does not match any case in the switch
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        try {
            // This call will demonstrate the bug if the input string is shorter than 6 characters
            System.out.println(example.showBug("abcd"));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}