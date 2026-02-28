class MyClass {
    // BUG: DetachedTestCase
    // This method appears to be a test case but is not annotated with @Test.
    public void someMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // adding unreachable for loop
            System.out.println("This line will never be printed.");
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    // helper method to return false dynamically
    private boolean getCondition() {
        return false;
    }
}