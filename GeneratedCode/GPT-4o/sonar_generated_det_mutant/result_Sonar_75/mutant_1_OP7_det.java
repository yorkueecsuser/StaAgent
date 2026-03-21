class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        boolean pnetleom = false;while (pnetleom && false && false && true && true && true && true && true && true && false && false && false) {char oarfgltw = 'g';}
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