class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            return "Unreachable Code";
        } else {
            // This block is also unreachable because the if block is unreachable
            return "Another Unreachable Code";
        }

        return null;
    }

    private boolean getCondition() {
        // Always return false to ensure the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}