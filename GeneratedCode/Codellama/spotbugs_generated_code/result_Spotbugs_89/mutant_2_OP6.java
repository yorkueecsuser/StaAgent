class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);

        // Mutant 1: Unreachable for loop
        int z = 0;
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            z = i;
        }
        System.out.println("z = " + z);
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;

        // Mutant 2: Unreachable for loop
        int z = 0;
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            z = i;
        }
        return z;
    }
}