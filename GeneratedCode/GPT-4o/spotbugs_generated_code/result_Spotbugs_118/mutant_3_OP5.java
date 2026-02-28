class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
        
        // Unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
            default:
                System.out.println("This default line will also never be executed.");
        }
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }

    // This method ensures the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns 0, which does not match any case in the switch
    }
}