class SelfComputationExample {

    public int showBug(int x) {
        // Insert dead store with a randomly generated variable name
        int abcdexyz = 10; // Dead store added
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public int showBug2(int x) {
        // Insert dead store with a randomly generated variable name
        int qwertyui = 20; // Dead store added
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}