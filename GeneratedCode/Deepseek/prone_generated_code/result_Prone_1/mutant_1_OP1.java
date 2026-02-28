class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int deadStore_123abc = 0; //This is the mutation part
        return numerator / deadStore_123abc;  // This line throws ArithmeticException
    }

}