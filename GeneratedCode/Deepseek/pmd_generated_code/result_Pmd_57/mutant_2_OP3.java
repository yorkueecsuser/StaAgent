class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }
    // Mutated Code
    public static boolean getCondition() {
        return true;
    }
    public static void mutatedShowBug() {
        Foo f = new Foo(); // This will throw a compilation error
        if (getCondition()) {
            // Unreachable code
            System.out.println("This line will never be executed");
        }
    }
}