class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void someUnreachableCode() {
        boolean condition = false;
        if (condition) {
            System.out.println("This code will never run.");
        } else {
            System.out.println("This code will always run.");
        }
    }
}