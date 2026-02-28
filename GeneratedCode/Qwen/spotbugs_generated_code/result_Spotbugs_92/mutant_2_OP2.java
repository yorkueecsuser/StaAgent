class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
        // Mutant: Duplicating the assignment statement
        int tempValue = value;
        int tempValue = value; // Duplicate assignment
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}