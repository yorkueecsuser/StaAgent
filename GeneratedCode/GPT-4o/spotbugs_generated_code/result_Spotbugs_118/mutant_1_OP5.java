class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            // No default case to maintain it unreachable
        }
        
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
    
    // Method to ensure non-constant value for unreachable switch
    private int getUnreachableValue() {
        return 0; // This value will not match any case in the switch
    }
}