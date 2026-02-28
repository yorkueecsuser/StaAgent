class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) // BUG: BrokenNullCheck
            return input;
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }

        // should be ||
        if (input == null && input.equals("")) // BUG: BrokenNullCheck
            return input;

        // Inserting an unreachable while loop
        boolean anotherConditionWhile = getAnotherCondition();
        while (anotherConditionWhile) {
            // Unreachable code
            System.out.println("This is another unreachable loop");
        }

        return null;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This method can be modified to return true in a real scenario
    }

    // Another method to provide a dynamic condition for the while loop
    private boolean getAnotherCondition() {
        return false; // This method can be modified to return true in a real scenario
    }
}