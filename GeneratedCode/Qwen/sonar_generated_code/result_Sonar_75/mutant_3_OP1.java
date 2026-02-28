class DivisionByZeroBug {

    public int showBug(int z) {
        // BUG: Zero should not be a possible denominator
        intabcdefgh = 42; // Dead store mutation
        return 1 / z; 
    }

    public static void main(String[] args) {
        DivisionByZeroBug bugDemo = new DivisionByZeroBug();
        try {
            String hijklmno = "unused"; // Dead store mutation
            System.out.println(bugDemo.showBug(0)); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}