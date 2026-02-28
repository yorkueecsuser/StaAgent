class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutation code
    // unreachable while loop in the main method
    public static void main(String[] args) {
        boolean condition = false;
        while(condition) {
            // unreachable code
        }
    }
}