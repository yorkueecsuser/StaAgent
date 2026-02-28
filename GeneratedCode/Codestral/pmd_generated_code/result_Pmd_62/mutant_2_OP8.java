class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass a = new MyClass(); // Mutant: Renaming 'obj' to 'a'
    }

    public static void main(String[] args) {
        MyClass b = new MyClass(); // Mutant: Renaming 'obj' to 'b'
        b.showBug();
    }
}