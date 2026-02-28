class PreconditionsExample {

    public String showBug(int value) {
        // This line contains the bug as it uses %d instead of %s
        if (value < 0) {
            throw new IllegalArgumentException(String.format("Value must be non-negative: %d", value)); // BUG: PreconditionsInvalidPlaceholder
        }
        
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case");
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
        
        return "Valid value";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
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