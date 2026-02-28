class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION) 

        // Added loop for mutation
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return result;
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}