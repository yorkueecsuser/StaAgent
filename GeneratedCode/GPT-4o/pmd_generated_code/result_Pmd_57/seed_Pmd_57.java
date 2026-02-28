class Foo {
    private Foo() {} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}