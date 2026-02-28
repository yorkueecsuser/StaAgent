class MyClass {
    // BUG: DetachedTestCase
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod();
        // Mutant Code: Unreachable if-else statement
        boolean shouldNotRun = falseMethod();
        if (shouldNotRun) {
            System.out.println("This code should never execute.");
        } else {
            System.out.println("This is the reachable part of the if-else statement.");
        }
    }

    private boolean falseMethod() {
        return false;
    }
}