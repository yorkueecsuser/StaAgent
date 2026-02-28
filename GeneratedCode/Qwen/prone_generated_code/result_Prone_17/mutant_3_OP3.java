class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        // Mutant: Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
        
        return input.toUpperCase();
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        try {
            System.out.println(example.showBug(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}