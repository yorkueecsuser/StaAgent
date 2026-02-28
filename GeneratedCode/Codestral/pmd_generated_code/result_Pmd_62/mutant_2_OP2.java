class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
        // Mutant added: Duplication of the print statement
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