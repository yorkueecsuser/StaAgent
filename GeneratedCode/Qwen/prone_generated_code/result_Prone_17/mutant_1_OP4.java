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
            // This block will never be executed because getCondition() always returns false
            System.out.println("This is an unreachable block");
        } else {
            // Alternative block that will always be executed
            System.out.println("This is the reachable block");
        }
        
        return input.toUpperCase();
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
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