class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }

    private boolean getCondition() {
        return false; // This makes the if statement condition always false, hence unreachable
    }
}