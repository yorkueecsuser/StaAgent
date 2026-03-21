class Foo {
    private Foo() {if (false && true && true && true && false && true && false && true && true && false && false) {boolean eioqayam = true;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}