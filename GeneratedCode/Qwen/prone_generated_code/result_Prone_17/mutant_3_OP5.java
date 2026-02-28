class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case");
                break;
            default:
                // Default case to ensure switch is valid
                break;
        }
        
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        try {
            System.out.println(example.showBug(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the switch statement is unreachable
        return false;
    }
}