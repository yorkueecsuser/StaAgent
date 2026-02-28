// This is a minimal implementation with no external libraries to showcase the bug.
// Please note that the `Bar` class is commented out as it doesn't exist.

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public static boolean getCondition() {
        // This is a placeholder method to return a false condition for our mutant
        // In a real-world scenario, this method could be replaced by a more complex logic
        return false;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            // This code is unreachable as getCondition() always returns false
            System.out.println("Unreachable code executed");
        } else {
            System.out.println("Else block of unreachable if-else statement");
        }
    }
}