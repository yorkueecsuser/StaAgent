class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 999: // This case is designed to never be reached
                System.out.println("Unreachable code");
                break;
        }

        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 999: // This case is designed to never be reached
                System.out.println("Unreachable code");
                break;
        }

        return result;
    }

    private int getUnreachableCondition() {
        // Always returns a value that doesn't match the case in the switch statement
        return -1;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}