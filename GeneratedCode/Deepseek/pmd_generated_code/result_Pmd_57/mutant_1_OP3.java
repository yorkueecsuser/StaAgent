class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutation
    public static void mutatedShowBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'

        boolean condition = false; // Mutation: using compile-time constant 'false'
        if (condition) {
            System.out.println("This is unreachable code"); // This will become reachable through mutation
        }
    }
}