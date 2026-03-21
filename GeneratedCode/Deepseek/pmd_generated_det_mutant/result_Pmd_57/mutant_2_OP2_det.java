class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass
public static void showBug() {
    Foo f = new Foo();
    f = new Foo();
}
}