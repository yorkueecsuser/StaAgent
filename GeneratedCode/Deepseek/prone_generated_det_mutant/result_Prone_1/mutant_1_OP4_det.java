class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        if (false && true && true && false && false && true && true && true && false && false && false) {float dfnemabq = 309420648;}else{short ldltzndj = 434;}
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    
}

}