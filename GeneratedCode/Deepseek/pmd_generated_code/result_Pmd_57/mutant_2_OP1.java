class Foo {
    private Foo() {}
    void foo() {}

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
        int mutant = 42; // Dead store added here
    }
}