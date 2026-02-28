class ClassLoaderBug {
    private boolean getFalseCondition() {
        return false;
    }

    public ClassLoader showBug() {
        ClassLoader cl = this.getClass().getClassLoader();

        // Mutant: Unreachable if-else statement
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        } else {
            // This else block should also be unreachable
            int i = 1 / 0; // This line will throw an ArithmeticException to make sure this code is not executed
        }

        return cl;
    }
}