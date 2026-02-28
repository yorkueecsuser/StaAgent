class UninitializedMocksExample {
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        // Adding an unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This line will never execute.");
        }

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    // Method that always returns false to make the loop unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}