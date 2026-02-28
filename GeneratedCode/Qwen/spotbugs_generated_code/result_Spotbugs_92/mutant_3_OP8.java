class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug

        // Mutated code
        int a = 10;
        int b = a;
        System.out.println(a == b); // This is a valid comparison, not related to the bug
    }
}