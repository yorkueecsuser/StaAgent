class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        boolean ahefbvgv = false;while (ahefbvgv && true && true && false && false && false && true && false && true && true && false && false) {char gwbinagw = 'a';}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}