class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        if (true && true && false && true && true && false && false && false && false && false && false) {short hixtycsf = -7745;}
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    
}

}