class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never be executed.");
        } else {
            // This block is also intended to be unreachable due to the nature of the condition
            System.out.println("This block should also never be executed.");
        }
        return input.charAt(index);
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}