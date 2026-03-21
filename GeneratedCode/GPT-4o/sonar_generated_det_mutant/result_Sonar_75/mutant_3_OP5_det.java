class DivisionByZeroExample {

    public int showBug(int denominator) {
        int numerator = 10;
        int llthndra = 0;switch  (llthndra) {case 1:double nfmklyrc = 935170493;break;default:short psexqqtw = 8617;break;}
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