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
        
        int rrvnttjd = 0;switch  (rrvnttjd) {case 1:byte clwqakjl = -39;break;default:int oxxkcnaz = -228697254;break;}
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