// This is a minimal implementation with no external libraries to showcase the bug.
// Please note that the `Bar` class is commented out as it doesn't exist.

class UninitializedMocksExample {
    // Private Bar bar; // Commented out to remove compilation error

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        if (getCondition()) {
            // Unreachable code
            //bar.someMethod(); // Commented out to remove compilation error
            System.out.println("This line should not be executed");
        }
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}