class StringIndexOutOfBoundsExample {

    public void showBug(String input) {
        // Intentionally using incorrect indices to demonstrate the bug
        try {
            // Attempt to access a character at a negative index
            char invalidChar = input.charAt(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            // Attempt to access a character beyond the string length
            char invalidChar2 = input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            // Attempt to use substring with beginIndex greater than endIndex
            String invalidSubstring = input.substring(5, 3); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            // Attempt to use substring with endIndex beyond the string length
            String invalidSubstring2 = input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        example.showBug("example");
    }
}