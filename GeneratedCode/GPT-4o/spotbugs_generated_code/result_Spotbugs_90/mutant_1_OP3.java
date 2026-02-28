class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        // Mutation: Add an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        }
        
        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Mutation: Add an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        }
        
        return result;
    }

    private boolean getFalseCondition() {
        return false; // Condition always evaluates to false, making the above if blocks unreachable.
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}