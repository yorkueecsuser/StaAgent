class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        boolean kcjxyvqn = false;while (kcjxyvqn && true && false && false && true && true && false && false && false && true && true && false) {byte gvazozfm = -63;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}