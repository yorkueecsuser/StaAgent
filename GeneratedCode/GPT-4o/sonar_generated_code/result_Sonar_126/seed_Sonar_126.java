class BugDemo {

    public static class Parent {
        public void doSomething(java.awt.Point p) {
            //...
        }

        public static void doSomethingElse() {
            //...
        }

        private void privateMethod() {
            // Private method
        }
    }

    public static class Child extends Parent {

        public void doSomething(java.util.Date p) {  // BUG: Child class methods named for parent class methods should be overrides
            // ...
        }

        // Intentionally changed to static to resolve compilation error
        public static void doSomethingElse() {  // BUG: Child class methods named for parent class methods should be overrides
            // ...
        }

        public void privateMethod() {  // BUG: Child class methods named for parent class methods should be overrides
            // ...
        }
    }

    public static void showBug() {
        Child child = new Child();
        child.doSomething(new java.util.Date()); // This uses the Child's method
        Child.doSomethingElse(); // Changed to Child.doSomethingElse() due to static method
        child.privateMethod(); // This uses the Child's method
    }
}