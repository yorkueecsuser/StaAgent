class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    public boolean getCondition() {
        return false;
    }

    public void addMutation() {
        if (getCondition()) {
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will always be executed");
        }
    }
}