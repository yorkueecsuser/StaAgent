class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;

        // Adding a loop that does not affect the functionality
        int i = 0;
        while (i < 1) {
            i++;
        }
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug

        // Adding a loop that does not affect the functionality
        int j = 0;
        do {
            j++;
        } while (j < 1);
    }
}