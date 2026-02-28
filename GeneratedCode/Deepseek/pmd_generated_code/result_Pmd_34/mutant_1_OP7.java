class Foo extends Throwable {
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    // Mutated Code: Unreachable while loop
    public void unreachableWhileLoop() {
        boolean condition = true;
        while (condition) {
            // Infinite loop - unreachable code
        }
    }
}