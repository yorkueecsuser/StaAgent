class AlwaysThrows {

    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        // begin
        for(int i = 0; false; i++) {
            System.out.println("Unreachable loop");
        }
        // end
        return numerator / denominator;  // This line throws ArithmeticException
    }
}