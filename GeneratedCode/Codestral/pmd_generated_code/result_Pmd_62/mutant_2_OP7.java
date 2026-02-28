class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {  // Unreachable while loop
            System.out.println("This line is unreachable");
        }
        MyClass obj = new MyClass();
    }

    private boolean getCondition() {
        return false;  // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}