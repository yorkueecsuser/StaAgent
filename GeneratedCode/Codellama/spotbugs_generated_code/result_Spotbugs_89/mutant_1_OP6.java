class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // Code in this block is unreachable
            // This block is added only to make the code compile successfully
            // and to avoid unreachable statement error
            System.out.println("This block is unreachable");
        }
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // Code in this block is unreachable
            // This block is added only to make the code compile successfully
            // and to avoid unreachable statement error
            System.out.println("This block is unreachable");
        }
    }
}