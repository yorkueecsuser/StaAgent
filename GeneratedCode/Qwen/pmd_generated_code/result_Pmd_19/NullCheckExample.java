class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;
        return null;
    }

    // Mutated code with renaming operator
    public String showBug(String x) {
        // should be &&
        if (x!= null ||!x.equals("")) // BUG: BrokenNullCheck
            return x;
        // should be ||
        if (x == null && x.equals("")) // BUG: BrokenNullCheck
            return x;
        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
        System.out.println(example.showBug("test")); // Additional test case
    }
}