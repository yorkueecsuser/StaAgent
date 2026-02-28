class DivisionByZeroBug {

    public int showBug(int z) {
        // BUG: Zero should not be a possible denominator
        return 1 / z; 
    }

    public static void main(String[] args) {
        DivisionByZeroBug bugDemo = new DivisionByZeroBug();
        try {
            System.out.println(bugDemo.showBug(0)); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop should never execute.");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the loop condition always false
        return false;
    }
}