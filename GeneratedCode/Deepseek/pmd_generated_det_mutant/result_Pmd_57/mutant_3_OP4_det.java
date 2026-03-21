class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        if (true && true && true && true && false && false && false && false && true && false && false) {String jshjqoyf = "uykwkczy";}else{boolean nfrhzpap = false;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}