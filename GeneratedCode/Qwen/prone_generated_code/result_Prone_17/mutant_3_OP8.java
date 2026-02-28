class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        return input.toUpperCase();
    }

    // Mutated code with renaming of variable 'input' to 'a'
    public String showBugMutated(String a) {
        if (a == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (a == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        return a.toUpperCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        try {
            System.out.println(example.showBug(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing the mutated method
        try {
            System.out.println(example.showBugMutated(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}