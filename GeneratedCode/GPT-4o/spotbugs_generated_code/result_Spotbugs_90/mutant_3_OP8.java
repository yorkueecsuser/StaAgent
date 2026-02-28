class SelfComputationExample {

    public int showBug(int y) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = y & y; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public int showBug2(int z) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = z - z; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public static void main(String[] args) {
        SelfComputationExample a = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + a.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + a.showBug2(5));
    }
}