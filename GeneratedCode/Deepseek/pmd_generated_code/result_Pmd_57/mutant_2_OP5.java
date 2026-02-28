class Foo {
    private Foo() {}
    void foo() {}

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    public static void unreachableSwitchStatement() {
        int value = 0;
        switch(value) {
            case 0:
                break;
            default:
                break;
        }
    }
}