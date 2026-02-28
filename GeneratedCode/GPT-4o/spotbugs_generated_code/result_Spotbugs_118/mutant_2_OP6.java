class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Unreachable for loop added as a mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
    
    private boolean getCondition() {
        return false; // Ensures the loop is never entered
    }
}