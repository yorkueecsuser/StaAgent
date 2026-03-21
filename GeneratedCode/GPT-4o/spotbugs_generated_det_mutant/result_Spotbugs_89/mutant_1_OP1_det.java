class SelfComputationExample {

    private int x = 42;

    public int showBug() {
        // Perform a nonsensical computation of x with itself
        boolean smauxcrg = false;
        int result = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug();
        System.out.println("Result of nonsensical self computation: " + result);
    }
}