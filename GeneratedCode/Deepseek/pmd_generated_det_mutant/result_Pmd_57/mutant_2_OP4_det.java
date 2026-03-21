class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        if (true && true && true && true && false && true && true && true && true && false && false) {short wugrvtxn = -2561;}else{double armuclom = 715515270;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}