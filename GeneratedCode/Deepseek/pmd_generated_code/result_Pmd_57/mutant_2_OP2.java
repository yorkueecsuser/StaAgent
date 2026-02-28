class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutant Code: Duplication
    public static void showBugMutant() {
        Foo f = new Foo(); // This will not throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }
}