class Foo {
    private Foo() {if (false && true && true && false && false && true && false && true && false && false && false) {boolean yknsqswn = false;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}