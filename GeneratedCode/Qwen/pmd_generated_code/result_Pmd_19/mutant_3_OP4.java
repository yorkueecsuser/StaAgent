class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Unreachable if-else statement mutation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed");
        } else {
            // Alternative code
            System.out.println("This is the alternative code");
        }

        return null;
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}