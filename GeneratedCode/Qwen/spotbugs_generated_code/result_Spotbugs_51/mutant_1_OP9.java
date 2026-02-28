class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // Introducing a do-while loop that does nothing to satisfy the mutation operator requirement
        int i = 0;
        do {
            // This loop does nothing and is just to satisfy the mutation operator requirement
        } while (i < 0); // Condition is always false, so the loop body is never executed

        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}