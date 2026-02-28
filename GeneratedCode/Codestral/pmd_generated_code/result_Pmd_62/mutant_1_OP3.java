class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}