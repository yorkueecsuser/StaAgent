class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Introducing a dummy loop that does not affect the logic
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
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