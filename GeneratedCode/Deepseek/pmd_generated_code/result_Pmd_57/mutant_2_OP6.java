class Foo {
    private Foo() {}
    void foo() {}

    public static void showBug() {
        Foo f = new Foo();
        for (int i = 0; i < 0; i++) {
            // Unreachable for loop
            // This loop is always false, thus unreachable
        }
    }
}