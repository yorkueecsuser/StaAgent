class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop is unreachable because getCondition() returns false
        }

        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
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
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}