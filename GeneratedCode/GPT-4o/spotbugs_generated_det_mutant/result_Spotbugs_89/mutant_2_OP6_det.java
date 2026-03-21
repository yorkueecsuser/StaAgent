class SelfComputationExample {

    private int x = 42;

    public int showBug() {
        // Perform a nonsensical computation of x with itself
        for  (int rookqgfu = 0; rookqgfu < 0; rookqgfu++) {long njfsjrbu = -159313613;}
        int result = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug();
        System.out.println("Result of nonsensical self computation: " + result);
    }
}