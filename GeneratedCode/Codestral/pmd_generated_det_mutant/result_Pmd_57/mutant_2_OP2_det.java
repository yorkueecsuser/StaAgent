// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
public static void showBug() {
    Foo fooInstance = new Foo();
    fooInstance = new Foo();
    fooInstance.foo();
}
}