class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable as conditionWhile is set to always be false
            System.out.println("Unreachable while loop in showBug method");
        }
        
        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable as conditionWhile is set to always be false
            System.out.println("Unreachable while loop in showBug2 method");
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false to ensure the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}