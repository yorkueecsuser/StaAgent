class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // unreachable code
            System.out.println("This code will never be executed.");
        }
        return value == value; // original bug line, still present
    }
}