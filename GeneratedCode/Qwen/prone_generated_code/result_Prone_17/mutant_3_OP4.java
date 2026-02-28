class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            System.out.println("This block is reachable if condition is true");
        } else {
            // This block is unreachable because condition is always false
            System.out.println("This block is unreachable");
        }
        
        return input.toUpperCase();
    }

    private boolean getCondition() {
        // Always returns false, making the else block unreachable
        return false;
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