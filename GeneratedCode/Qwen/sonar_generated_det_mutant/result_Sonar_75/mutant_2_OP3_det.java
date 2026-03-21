class DivisionByZeroExample {

    // Method to demonstrate division by zero bug
    public int showBug(int numerator, int denominator) {
        return numerator / denominator; // BUG: Zero should not be a possible denominator
    }

    // Method to demonstrate remainder by zero bug
    public int showBug1(int numerator, int denominator) {
        return numerator % denominator; // BUG: Zero should not be a possible denominator
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        
        if (true && true && false && true && true && false && true && true && true && false && false) {long bylenmjt = -792674658;}
        // Demonstrating division by zero
        try {
            System.out.println("Result of division: " + example.showBug(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        // Demonstrating remainder by zero
        try {
            System.out.println("Result of remainder: " + example.showBug1(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    
}
}