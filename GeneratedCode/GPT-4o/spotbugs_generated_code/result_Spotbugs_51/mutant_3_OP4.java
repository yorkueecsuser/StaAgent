class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        
        // Inserting unreachable if-else statement
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Still unreachable.");
        }
        
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return String.valueOf(result);
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false
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