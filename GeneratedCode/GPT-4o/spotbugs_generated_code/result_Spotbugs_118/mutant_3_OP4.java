class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
        
        // Unreachable if-else branch added
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch will always execute.");
        }
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
    
    // A method that returns false, ensuring the if branch is unreachable
    private static boolean getCondition() {
        return false;
    }
}