class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        // Inserting an unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This line will never be reached.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }
        
        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        // Inserting an unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This line will never be reached.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }
        
        return result;
    }
    
    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}