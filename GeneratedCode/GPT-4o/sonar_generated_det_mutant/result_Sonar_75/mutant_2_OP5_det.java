class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        int btmjxofe = 0;switch  (btmjxofe) {case 1:int nvspprpv = -240199217;break;default:short cagwdeco = 9674;break;}
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