class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Original bug: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        boolean impossibleInstanceof = obj instanceof StringBuilder; 
        
        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }

        return impossibleInstanceof;
    }

    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // This will always return false, making the if statement unreachable
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}