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
            // This block is unreachable because condition is never set to true
            System.out.println("This is an unreachable block");
        } else {
            // Alternative code
            System.out.println("This is the alternative code");
        }

        return null;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}