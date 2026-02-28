// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int z = 10; // Dead Store operator - added unused variable declaration
        System.out.println(y);
    }
}