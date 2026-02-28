class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) { // BUG: BrokenNullCheck
            String temp = input; // Dummy assignment for demonstration
            String temp2 = input; // Duplicate of the above assignment
            return input;
        }
        // should be ||
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            String temp3 = input; // Dummy assignment for demonstration
            String temp4 = input; // Duplicate of the above assignment
            return input;
        }
        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}