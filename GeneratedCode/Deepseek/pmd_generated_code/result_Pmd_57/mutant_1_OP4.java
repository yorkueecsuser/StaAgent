class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    private static boolean getBugCondition() {
        return false;
    }

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void mutatedShowBug() {
        boolean bugCondition = getBugCondition();
        if(bugCondition) {
            Foo f = new Foo(); // This will throw a compilation error
            // 'Foo()' has private access in 'Foo'
        } else {
            System.out.println("Bug condition is false, mutant unreachable");
        }
    }
}