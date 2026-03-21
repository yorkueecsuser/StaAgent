class Foo {
    private Foo() {long xgspahhg = 489034694;
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}