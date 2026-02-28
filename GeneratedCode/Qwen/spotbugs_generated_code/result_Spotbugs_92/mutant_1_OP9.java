class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug

        // Added mutant code: Equivalent Loop Replacement (though no loop exists, adding a non-functional loop)
        int i = 0;
        do {
            i++;
        } while (i < 0); // This loop will never execute because the condition is false initially
    }
}