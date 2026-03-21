class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        for  (int omwkoizm = 0; omwkoizm < 0; omwkoizm++) {float jlhfgikk = 799709364;}
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    
}

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}