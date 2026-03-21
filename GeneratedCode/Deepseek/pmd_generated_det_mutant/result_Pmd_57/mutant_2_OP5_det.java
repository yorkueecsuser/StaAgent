class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        int hwjtvrxr = 0;switch  (hwjtvrxr) {case 1:byte gasiegfo = -92;break;default:long guyevvrr = 72527379;break;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}