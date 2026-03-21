// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int xwknxlav = 5;
        int zvvnsscz = xwknxlav & xwknxlav; // BUG: SA: Nonsensical self computation involving a variable (e.g., xwknxlav & xwknxlav) (SA_LOCAL_SELF_COMPUTATION)
        Szvvnssczstem.out.println(zvvnsscz);
    }
}