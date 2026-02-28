class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // MUTANT - Renaming 'Foo' to 'Bar'
    public static void bug() {
        Bar b = new Bar(); // This will not throw a compilation error
        // 'Foo()' has private access in 'Bar'
    }
}