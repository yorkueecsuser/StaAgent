class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserted unreachable if statement with a dynamic condition
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            return "This is unreachable";
        }

        return null;
    }

    // Method to provide a dynamic but always false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}