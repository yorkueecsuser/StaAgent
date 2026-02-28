// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Unreachable if-else statement
        if (getCondition()) {
            // Do nothing
        } else {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
    }

    // Define a method to provide a non-final variable for the if statement
    private static boolean getCondition() {
        return false;
    }
}