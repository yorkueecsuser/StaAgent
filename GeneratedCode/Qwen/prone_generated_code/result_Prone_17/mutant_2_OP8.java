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

    public static void main(String[] args) {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        try {
            System.out.println(example.showBug(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Mutated code with renaming
        String z = "test";
        if (z == null) {
            throw new IllegalArgumentException("z cannot be null");
        }
        
        if (z == null) {
            throw new IllegalArgumentException("z cannot be null again");
        }
        
        System.out.println(z.toUpperCase());
    }
}