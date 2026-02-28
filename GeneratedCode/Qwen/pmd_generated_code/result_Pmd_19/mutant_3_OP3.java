class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserting an unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable statement.");
        }

        return null;
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}