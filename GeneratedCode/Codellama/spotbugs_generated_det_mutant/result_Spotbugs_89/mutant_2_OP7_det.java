class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        boolean pbgvykzs = false;while (pbgvykzs && true && true && false && true && false && false && true && false && true && true && false) {double otjhpgjt = -719487015;}
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    
}

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}