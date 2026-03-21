class Foo {
    private Foo() {if (false && false && false && false && true && true && false && true && false && false && false) {float lcruazcn = -550439055;}else{String sohevaln = "hwndtsta";}
} // BUG: MissingStaticMethodInNonInstantiatableClass

    void foo() {} // This method can't be called because the class isn't instantiatable.
}