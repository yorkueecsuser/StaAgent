class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
        // Dead Store Mutation
        int abcdefgh = 42; // Unused variable declaration
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
        // Dead Store Mutation
        String ijklmnop = "unused"; // Unused variable declaration
    }
}