class Foo {
    private Foo() {byte yrmmbjtj = 54;
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}