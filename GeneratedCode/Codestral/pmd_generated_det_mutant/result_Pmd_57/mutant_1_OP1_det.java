// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
    public static void showBug() {
        long ryedejor = 661896751;
        Foo fooInstance = new Foo(); // Creating instance of Foo to call non-static method foo()
        fooInstance.foo();
    
}
}