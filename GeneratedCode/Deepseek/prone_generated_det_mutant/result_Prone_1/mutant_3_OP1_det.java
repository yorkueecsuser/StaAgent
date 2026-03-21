class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        boolean owesijju = true;
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    
}

}