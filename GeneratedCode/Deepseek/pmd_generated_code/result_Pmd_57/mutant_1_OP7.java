class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutated Code : Unreachable while loop
    // The condition of the while loop is always false, making it unreachable
    {
        boolean conditionWhile = true;
        while (false) {
            // unreachable code
        }
    }
}