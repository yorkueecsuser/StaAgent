class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Added a loop that does not affect the logic
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}