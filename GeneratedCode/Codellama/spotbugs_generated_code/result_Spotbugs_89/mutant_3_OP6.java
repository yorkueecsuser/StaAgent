class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);

        // Unreachable for loop
        for (int i = 0; i < 1; i++) {
            int z = 0;
            System.out.println("z = " + z);
        }
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;

        // Unreachable for loop
        for (int i = 0; i < 1; i++) {
            int z = 0;
            return z;
        }
    }
}