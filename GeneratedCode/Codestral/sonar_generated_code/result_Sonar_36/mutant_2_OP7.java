class UninitializedMocksExample {
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}