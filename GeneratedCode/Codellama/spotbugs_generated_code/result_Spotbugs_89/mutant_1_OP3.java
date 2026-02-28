class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }

    public int showMutant() {
        int x = 5;
        boolean condition = getCondition();
        if (condition) {
            int y = x & x; // Unreachable code
            return y;
        } else {
            int z = 10;
            System.out.println("z = " + z);
            return z;
        }
    }
}