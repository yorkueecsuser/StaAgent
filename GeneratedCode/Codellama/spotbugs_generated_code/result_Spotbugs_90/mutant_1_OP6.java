// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Code inside the loop will never execute
            // This is a redundant and unreachable code
            // This code will not affect the output of the program
            System.out.println("This code is unreachable");
        }
    }
}