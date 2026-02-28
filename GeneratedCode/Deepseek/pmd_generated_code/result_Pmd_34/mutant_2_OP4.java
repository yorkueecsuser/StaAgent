class Foo extends Throwable {
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        boolean condition = true; //Mutation 1: Avoid compile-time constant 'false' for if statement
        if (condition) {
            // Original code
            // this line intentionally left blank to demonstrate the bug
        } else {
            // this line intentionally left blank to demonstrate the bug
        }
    }
}