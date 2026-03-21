class Foo {
    private Foo() {if (false && true && false && true && true && true && false && true && false && false && false) {short ovldecda = 7059;}else{float eneoqtqz = -553365395;}
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}