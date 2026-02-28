class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBug() {
        Object integerObject = Integer.valueOf(42);
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        
        // Unreachable for loop insertion
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
        
        return result;
    }
    
    // Method to provide a runtime condition
    private boolean getCondition() {
        return false; // Ensures the loop is not executed
    }
}