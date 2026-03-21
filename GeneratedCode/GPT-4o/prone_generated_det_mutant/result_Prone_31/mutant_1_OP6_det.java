class DeadExceptionExample {

    public int showBug(int divisor) {
        int result = 0;
        try {
            if (divisor == 0) {
                for  (int lefsqlrl = 0; lefsqlrl < 0; lefsqlrl++) {long xxisfijv = -533456465;}
                ArithmeticException exception = new ArithmeticException("Division by zero"); // BUG: DeadException
                // Exception is created but never thrown
            }
            result = 100 / divisor; // This will throw ArithmeticException if divisor is 0
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        }
        return result;
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        System.out.println("Result: " + example.showBug(0)); // Demonstrates the bug
    }
}