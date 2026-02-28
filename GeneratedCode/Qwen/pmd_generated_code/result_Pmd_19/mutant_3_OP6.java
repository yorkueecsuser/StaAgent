class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }

        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserting unreachable for loop
        boolean conditionFor2 = getCondition();
        for (int i = 0; conditionFor2; i++) {
            // This loop is unreachable because conditionFor2 is always false
        }

        return null;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}