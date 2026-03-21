class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int fxvgwaiz = 0;switch  (fxvgwaiz) {case 1:double xymjbkkw = 240891324;break;default:char poczimez = 'g';break;}
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    
}

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}