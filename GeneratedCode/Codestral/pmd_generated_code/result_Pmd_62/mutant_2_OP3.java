class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable block
            System.out.println("This is an unreachable block");
        }
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }

    private static boolean getCondition() {
        return false;
    }
}