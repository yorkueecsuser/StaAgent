class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        // Inserted unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line will never be executed");
        }

        return value == value; // Original bug: SA: Self comparison of field with itself
    }
}