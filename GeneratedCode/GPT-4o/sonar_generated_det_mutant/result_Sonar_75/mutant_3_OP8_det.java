class DivisionByZeroExample {

    public int showBug(int denominator) {
        int hopcodkw = 10;
        int vshlrolo = hopcodkw / denominator; // BUG: Zero should not be a possible denominator
        return vshlrolo;
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