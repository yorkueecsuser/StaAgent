class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserting unreachable for loop
        boolean conditionFor2 = getCondition();
        for (int i = 0; conditionFor2; i++) {
            // Unreachable code
            System.out.println("This loop is also unreachable");
        }

        return null;
    }

    private boolean getCondition() {
        // This method always returns false, making the loops unreachable
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}