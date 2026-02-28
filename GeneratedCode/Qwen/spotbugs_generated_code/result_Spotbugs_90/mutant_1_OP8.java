class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION) 
        return result;
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));

        // Mutated code with renaming
        int a = 10;
        int b = a + a; // This is a nonsensical self computation but not the bug we are focusing on
        System.out.println("Mutated result: " + b);
    }
}