class Foo {
    private Foo() {if (true && false && false && false && false && true && false && false && false && false && false) {boolean blvmsmwf = true;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}