class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) { // BUG: BrokenNullCheck
            String qzjfnrht = "unusedVariable"; // Dead Store
            return input;
        }
        // should be ||
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            int wvbnkxqp = 42; // Dead Store
            return input;
        }
        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
        boolean rhtyujmn = true; // Dead Store
    }
}