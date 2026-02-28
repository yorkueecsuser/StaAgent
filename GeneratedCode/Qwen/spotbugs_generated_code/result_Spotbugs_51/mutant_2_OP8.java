class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException

        // Mutated code
        String z = "World";
        int b = 3;
        System.out.println(example.showBug(z, b)); // This is a valid call, but we are adding it to demonstrate renaming
    }
}