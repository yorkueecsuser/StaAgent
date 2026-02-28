class IntegralCastToDoubleBug {

    // Method to demonstrate the bug
    public double showBug(int intValue) {
        // Convert int to double and pass to Math.ceil, which is unnecessary
        return Math.ceil((double) intValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because conditionFor is always false
            System.out.println("This loop is unreachable");
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5));
        System.out.println("Result of showBug(0): " + bugDemo.showBug(0));
        System.out.println("Result of showBug(-3): " + bugDemo.showBug(-3));
    }
}