class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        if (true && true && true && true && true && true && true && true && true && false && false) {int bslxauax = -637245280;}else{boolean tvnyjgkg = false;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}