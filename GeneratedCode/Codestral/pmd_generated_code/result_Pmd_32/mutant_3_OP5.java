class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean shouldRun = getFalse();
        if (shouldRun) {
            // This switch statement is unreachable as getFalse() always returns false
            switch (0) {
                case 1:
                    // Unreachable code
                    System.out.println("This statement should never be executed.");
                    break;
            }
        }
    }

    public boolean getFalse() {
        return false;
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }
}