class DivisionByZeroBug {

    public int showBug(int z) {
        // BUG: Zero should not be a possible denominator
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative unreachable block
            System.out.println("This is another unreachable block.");
        }
        return 1 / z; 
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        DivisionByZeroBug bugDemo = new DivisionByZeroBug();
        try {
            System.out.println(bugDemo.showBug(0)); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}