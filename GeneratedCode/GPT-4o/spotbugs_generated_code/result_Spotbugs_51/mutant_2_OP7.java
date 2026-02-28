class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Introducing a non-final variable to use as a condition for the unreachable while loop
        boolean conditionWhile = getCondition();
        
        // Unreachable while loop mutation
        while (conditionWhile) {
            // This block will never be executed because conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return String.valueOf(result);
    }
    
    // This method always returns false, ensuring the while loop is unreachable
    private boolean getCondition() {
        return false;
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