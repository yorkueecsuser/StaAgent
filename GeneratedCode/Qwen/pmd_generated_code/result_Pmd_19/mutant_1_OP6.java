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

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}