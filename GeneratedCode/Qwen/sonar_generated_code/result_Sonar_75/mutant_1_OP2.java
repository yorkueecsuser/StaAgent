class DivisionByZeroBug {

    public int showBug(int z) {
        // BUG: Zero should not be a possible denominator
        int result = 1 / z; 
        int resultCopy = 1 / z; // Duplicate of the assignment statement
        return result;
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