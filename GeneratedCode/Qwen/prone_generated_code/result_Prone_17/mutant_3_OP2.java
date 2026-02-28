class CheckNotNullMultipleTimesExample {

    public String showBug(String input) {
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (input == null) { // BUG: CheckNotNullMultipleTimes
            throw new IllegalArgumentException("Input cannot be null again");
        }
        
        // Introducing a duplication mutation by duplicating the null check logic
        boolean isNull = input == null; // This is a simple assignment without method invocation
        boolean isNullDuplicate = input == null; // Duplicate of the previous line
        
        if (isNull) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        if (isNullDuplicate) {
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
}