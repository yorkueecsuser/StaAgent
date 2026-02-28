// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Mutant code begins
        boolean condition = getCondition();
        if (condition) {
            int z = x & x;
            System.out.println(z);
        } else {
            int w = x | x;
            System.out.println(w);
        }
        // Mutant code ends
    }

    // Utility method to generate a boolean value
    private static boolean getCondition() {
        return Math.random() > 0.5;
    }
}