class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        
        // Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block is also unreachable.");
        }

        return String.valueOf(result);
    }

    private boolean getCondition() {
        return false; // This makes the if-else statement unreachable
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