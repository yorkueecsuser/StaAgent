class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
        // Inserted unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            // This branch is unreachable because the condition is always false
            System.out.println("This branch should never be executed");
        }
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the condition unreachable
        return false;
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
}