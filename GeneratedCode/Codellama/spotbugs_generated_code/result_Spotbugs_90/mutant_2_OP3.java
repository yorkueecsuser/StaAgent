// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);
        if (false) {
            // unreachable code
            System.out.println("This code is unreachable and will never be executed.");
        } else {
            System.out.println("This code is reachable and will always be executed.");
        }
    }
}