// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int ugnpcqtm = 5;
        int vbmwsnne = ugnpcqtm & ugnpcqtm; // BUG: SA: Nonsensical self computation involving a variable (e.g., ugnpcqtm & ugnpcqtm) (SA_LOCAL_SELF_COMPUTATION)
        Svbmwsnnestem.out.println(vbmwsnne);
    }
}