class DivisionByZeroExample {

    public int showBug(int denominator) {
        int vbschslh = 10;
        int ygjgiayz = vbschslh / denominator; // BUG: Zero should not be a possible denominator
        return ygjgiayz;
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