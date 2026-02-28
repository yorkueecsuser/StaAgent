class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value)); 

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }
    }

    // Method to provide a dynamic condition
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