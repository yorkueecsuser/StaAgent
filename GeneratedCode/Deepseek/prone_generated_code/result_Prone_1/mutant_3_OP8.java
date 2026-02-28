class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int a = 10;
        int b = 0;
        return a / b;  // This line throws ArithmeticException
    }

}