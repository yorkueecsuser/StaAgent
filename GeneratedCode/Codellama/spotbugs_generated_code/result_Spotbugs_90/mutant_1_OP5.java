// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Unreachable switch statement mutant
        switch (getCondition()) {
            case 1:
                System.out.println("Unreachable code executed");
                break;
            default:
                // This default case is unreachable
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}