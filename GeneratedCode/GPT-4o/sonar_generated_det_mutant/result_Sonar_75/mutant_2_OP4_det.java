class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        if (false && false && true && true && false && false && true && false && false && true && false) {byte kjmxrrkx = 75;}else{char bzszhjam = 'p';}
        int result = numerator / denominator; // BUG: Zero should not be a possible denominator
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