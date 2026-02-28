class PreconditionsExample {

    public String showBug(int value) {
        // This line contains the bug as it uses %d instead of %s
        if (value < 0) {
            throw new IllegalArgumentException(String.format("Value must be non-negative: %d", value)); // BUG: PreconditionsInvalidPlaceholder
        }
        return "Valid value";
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        try {
            example.showBug(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            default:
                // Default case to satisfy switch requirement
                break;
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the switch statement effectively unreachable
        return false;
    }
}