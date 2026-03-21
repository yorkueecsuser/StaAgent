class DeadExceptionExample {
public int showBug(int divisor){
    int result = 0;
    result = 0;
    try { if(divisor == 0){ ArithmeticException exception = new ArithmeticException("Division by zero"); } result = 100 / divisor; } catch(ArithmeticException e){ System.out.println("Caught an arithmetic exception: " + e.getMessage()); }
    return result;
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        System.out.println("Result: " + example.showBug(0)); // Demonstrates the bug
    }
}