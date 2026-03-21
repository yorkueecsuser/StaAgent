class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        boolean trujjcmi = false;while (trujjcmi && false && false && true && true && false && true && true && false && false && true && false) {char akddtlaz = 'a';}
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