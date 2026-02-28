class MathMinMaxBug {

    // Method to demonstrate the bug
    public int showBug(int value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX) 
        return Math.min(0, Math.max(100, value)); 

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition unreachable
        return false;
    }

    public static void main(String[] args) {
        MathMinMaxBug bugDemo = new MathMinMaxBug();
        System.out.println("Result with value 50: " + bugDemo.showBug(50));
        System.out.println("Result with value -10: " + bugDemo.showBug(-10));
        System.out.println("Result with value 150: " + bugDemo.showBug(150));
    }
}