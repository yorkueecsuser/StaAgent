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

    public void unreachableIfElse() {
        if (getCondition()) {
            int a = 5;
            System.out.println(a);
        } else {
            int b = 10;
            System.out.println(b);
        }
    }

}