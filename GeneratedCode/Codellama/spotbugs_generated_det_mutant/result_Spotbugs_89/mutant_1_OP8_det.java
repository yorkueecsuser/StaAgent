class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int oaoipmsm = 5;
        int hmbsxteh = oaoipmsm & oaoipmsm; // BUG: SA: Nonsensical self computation involving a field (e.g., oaoipmsm & oaoipmsm) (SA_FIELD_SELF_COMPUTATION)
        Shmbsxtehstem.out.println("hmbsxteh = " + hmbsxteh);
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}