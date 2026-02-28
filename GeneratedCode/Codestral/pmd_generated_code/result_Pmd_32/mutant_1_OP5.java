class MyClass {
    // BUG: DetachedTestCase
    public void someMethod() {
        int value = getUnreachableValue();
        switch(value) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code block");
                break;
        }
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod(); // This will not be recognized as a test case by JUnit.
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1 to make the switch statement unreachable
    }
}