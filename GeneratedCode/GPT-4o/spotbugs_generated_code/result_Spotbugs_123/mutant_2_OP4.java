class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Original code with the bug
        boolean result = obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        
        // Inserting an unreachable if-else branch
        // Using a dynamically determined runtime condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block is also unreachable.");
        }
        
        return result;
    }
    
    // Method to simulate obtaining a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}