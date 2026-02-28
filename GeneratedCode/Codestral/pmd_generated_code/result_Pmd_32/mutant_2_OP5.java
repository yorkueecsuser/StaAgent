class MyClass {
    // BUG: DetachedTestCase
    public void someMethod() {
    }

    public void showBug() {
        MyClass myClass = new MyClass();
        myClass.someMethod();

        // Mutation: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code will never be executed
                System.out.println("This is an unreachable switch statement");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1, making the switch statement unreachable
        return 2;
    }
}