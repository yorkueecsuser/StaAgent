class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is unreachable code inside showBug");
        }

        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        
        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is unreachable code inside showBug2");
        }

        return result;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }

    // Method to simulate non-final condition for the unreachable loop
    private static boolean getConditionFor() {
        return false;
    }
}