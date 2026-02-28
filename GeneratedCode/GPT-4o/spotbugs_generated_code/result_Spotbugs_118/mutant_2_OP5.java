class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        boolean result = obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)

        // Adding unreachable switch statement based on a non-final variable
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case to avoid unreachable statement error
                break;
        }

        return result;
    }

    // Helper method to provide a condition for the switch statement
    private int getUnreachableCondition() {
        return 0; // This will ensure the case is never matched
    }
}