class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
        // Mutated code starts here
        System.out.println("I am about to construct myself");
        // Mutated code ends here
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