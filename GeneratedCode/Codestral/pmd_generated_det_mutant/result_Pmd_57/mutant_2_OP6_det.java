// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
    public static void showBug() {
        for  (int lztaetoe = 0; lztaetoe < 0; lztaetoe++) {double lfjwhzuf = 515974693;}
        Foo fooInstance = new Foo(); // Creating instance of Foo to call non-static method foo()
        fooInstance.foo();
    
}
}