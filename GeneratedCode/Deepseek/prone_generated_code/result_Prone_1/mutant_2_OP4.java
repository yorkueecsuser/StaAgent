class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    public void unreachableIfElse() {
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This is a mutant that cannot be executed.");
        } else {
            System.out.println("This statement is unreachable.");
        }
    }

}