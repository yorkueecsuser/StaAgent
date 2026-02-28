class SelfComputationExample {

    public int showBug(int x) {
        // Insert an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code block
            System.out.println("This is unreachable in showBug!");
        }

        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public int showBug2(int x) {
        // Insert an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code block
            System.out.println("This is unreachable in showBug2!");
        }
        
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    private boolean getCondition() {
        return false; // This will make the for loop unreachable
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}