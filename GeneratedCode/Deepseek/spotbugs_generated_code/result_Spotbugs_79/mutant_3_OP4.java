class IntComparisonBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int value) {
        // original bug
        if (value == 2147483648L) {
            // this branch will never be reached due to the bug
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This line will never execute due to the bug and the unreachable if branch");
            } else {
                System.out.println("This line will also never execute due to the bug and the unreachable else branch");
            }
        }
        return value == 2147483648L;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}