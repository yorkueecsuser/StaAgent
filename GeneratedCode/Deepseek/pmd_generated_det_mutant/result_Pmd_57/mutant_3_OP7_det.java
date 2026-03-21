class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        boolean jmsmncuf = false;while (jmsmncuf && false && false && true && true && false && false && true && true && false && false && false) {short nescbrmq = -2155;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}