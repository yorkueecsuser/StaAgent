class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        int deadVariable; // Dead store mutant: added this unused variable
        System.out.println("I am about to construct myself");
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