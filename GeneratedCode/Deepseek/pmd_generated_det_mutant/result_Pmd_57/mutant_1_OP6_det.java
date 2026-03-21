class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        for  (int wvywmtfm = 0; wvywmtfm < 0; wvywmtfm++) {int rfddymlb = -265317141;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}