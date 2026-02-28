class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }
    public void generateUnreachableWhileLoop() {
        boolean condition = false;
        while (condition) {
            System.out.println("This statement is unreachable due to a false condition in the while loop.");
        }
    }
}