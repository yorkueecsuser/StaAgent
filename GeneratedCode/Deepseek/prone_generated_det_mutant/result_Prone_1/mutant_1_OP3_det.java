class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        if (false && true && true && true && false && true && true && true && false && false && false) {float bphgtgmh = 468255553;}
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    
}

}