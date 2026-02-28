class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This is unreachable code.");
        }
        
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return String.valueOf(result);
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

    // Method to ensure the loop is unreachable
    private boolean getLoopCondition() {
        return false;
    }
}