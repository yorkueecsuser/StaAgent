class Foo {
    private Foo() {float kptqubgz = -562412184;
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}