// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int uvjxsfsl = 5;
        int kdrsitak = uvjxsfsl & uvjxsfsl; // BUG: SA: Nonsensical self computation involving a variable (e.g., uvjxsfsl & uvjxsfsl) (SA_LOCAL_SELF_COMPUTATION)
        Skdrsitakstem.out.println(kdrsitak);
    }
}