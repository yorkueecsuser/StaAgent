// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Unreachable if statement mutant
        if (false) {
            System.out.println("This statement is unreachable and should not be executed.");
        } else {
            System.out.println("This statement is reachable and should be executed.");
        }
    }
}