class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void mutatedCode() {
        boolean unreachableWhile = true;
        while(unreachableWhile) {
            // Insert unreachable code here
            break;
        }
    }
}