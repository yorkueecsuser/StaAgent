class PreconditionsExample {

    public String showBug(int value) {
        // This line contains the bug as it uses %d instead of %s
        if (value < 0) {
            throw new IllegalArgumentException(String.format("Value must be non-negative: %d", value)); // BUG: PreconditionsInvalidPlaceholder
        }
        
        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            System.out.println("This is an unreachable block");
        } else {
            // Alternative code that also should never execute due to the nature of the condition
            System.out.println("This is another unreachable block");
        }

        return "Valid value";
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        try {
            example.showBug(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}