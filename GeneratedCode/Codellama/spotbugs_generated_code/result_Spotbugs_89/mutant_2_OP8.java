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

    public int mutant(String[] args) {
        int a = 5;
        int b = a & a; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("b = " + b);
        return b;
    }
}