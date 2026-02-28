class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException

        // Mutated code with renaming operator
        StringIndexOutOfBoundsExample b = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug with renamed variable
        System.out.println(b.showBug("World", 5)); // This will throw StringIndexOutOfBoundsException
    }
}