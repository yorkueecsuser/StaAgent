class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
        // Unreachable if-else branch
        if (getUnreachableCondition()) {
            System.out.println("This should never be printed");
        } else {
            System.out.println("This is the reachable part");
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

    private boolean getUnreachableCondition() {
        // This method returns false to make the if statement unreachable
        return false;
    }
}