class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void unreachableForLoopMutant() {
        boolean condition = false;
        // Unreachable for loop
        for (int i = 0; condition; i++) {
            System.out.println("This loop will never be executed");
        }
    }
}