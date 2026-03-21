// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
    public static void showBug() {
        boolean gfvmnkyq = false;while (gfvmnkyq && true && false && true && true && true && true && true && false && false && false && false) {short ssdvlmge = 1508;}
        Foo fooInstance = new Foo(); // Creating instance of Foo to call non-static method foo()
        fooInstance.foo();
    
}
}