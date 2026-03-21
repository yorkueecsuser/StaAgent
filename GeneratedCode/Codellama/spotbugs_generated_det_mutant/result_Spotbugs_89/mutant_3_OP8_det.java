class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int ujotkvrr = 5;
        int gaxkarpn = ujotkvrr & ujotkvrr; // BUG: SA: Nonsensical self computation involving a field (e.g., ujotkvrr & ujotkvrr) (SA_FIELD_SELF_COMPUTATION)
        Sgaxkarpnstem.out.println("gaxkarpn = " + gaxkarpn);
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}