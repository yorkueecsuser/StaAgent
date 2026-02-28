class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value)); 

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will also never execute because shouldRun is always false
            System.out.println("This is another unreachable block.");
        }
    }

    // Method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        System.out.println("Result with value 50: " + bugDemo.showBug(50));
        System.out.println("Result with value -10: " + bugDemo.showBug(-10));
        System.out.println("Result with value 150: " + bugDemo.showBug(150));
    }
}