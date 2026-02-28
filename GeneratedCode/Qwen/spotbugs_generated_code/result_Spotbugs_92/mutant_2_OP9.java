class SelfComparisonBug {

    public boolean showBug(int value) {
        // Introducing a benign loop that does not affect the logic
        int i = 0;
        while (i < 1) {
            i++;
        }

        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}