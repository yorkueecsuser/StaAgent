class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void mutantUnreachableForLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This is an unreachable for loop
            // But since the condition is dynamically determined at runtime, this is not an error
        }
    }
}