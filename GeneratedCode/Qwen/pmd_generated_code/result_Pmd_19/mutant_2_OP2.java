class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        // Duplicate of the above if block without method invocation
        if (input!= null ||!input.equals("")) // DUPLICATE: BrokenNullCheck
            return input;

        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;
        // Duplicate of the above if block without method invocation
        if (input == null && input.equals("")) // DUPLICATE: BrokenNullCheck
            return input;

        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}