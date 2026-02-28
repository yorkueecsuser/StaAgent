class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);

        // Dead Store mutant
        String z = "random";
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;

        // Dead Store mutant
        int z = 0;
    }
}