// This is a minimal implementation with no external libraries to showcase the bug.
// Please note that the `Bar` class is commented out as it doesn't exist.

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    //private Bar bar; // Commented out to remove compilation error

    public boolean getCondition() {
        return false; // The condition is always false to make the if statement unreachable
    }

    public void showBug() {
        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error

        if (getCondition()) {
            // This if statement is intentionally unreachable
            System.out.println("This statement will never be executed");
        }

        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}