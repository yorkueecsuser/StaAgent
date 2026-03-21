class DivisionByZeroExample {
public int showBug(int denominator){
    int numerator = 10;
    int result = numerator / denominator;
    result = numerator / denominator;
    return result;
}

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        try {
            System.out.println(example.showBug(0)); // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}