class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        int ayzdrzsu = 0;switch  (ayzdrzsu) {case 1:long nptzhcos = -71972297;break;default:double yxjpvgbt = -328509824;break;}
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