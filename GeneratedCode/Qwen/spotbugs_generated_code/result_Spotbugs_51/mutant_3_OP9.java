class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException

        // Equivalent Loop Replacement Mutation
        int i = 0;
        do {
            if (i == 0) {
                System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
            }
            i++;
        } while (i < 1);
    }
}