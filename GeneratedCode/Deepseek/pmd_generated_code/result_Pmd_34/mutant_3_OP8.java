class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    // Mutation: Change the name of the class from Foo to Bar
    class Bar extends Throwable { 
        public void showBug() {
            // this line intentionally left blank to demonstrate the bug
        }
    }
}