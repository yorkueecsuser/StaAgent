class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutant Code: Unreachable if statement
    public static boolean getCondition() {
        return false; // using non-final variable or equivalent method call
    }

    public static void mutantCode() {
        if (getCondition()) {
            // code
            System.out.println("This code will never be executed");
        }
    }
}