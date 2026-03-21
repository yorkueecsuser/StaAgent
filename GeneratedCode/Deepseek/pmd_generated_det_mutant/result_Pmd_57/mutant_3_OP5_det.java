class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        int svwxuniy = 0;switch  (svwxuniy) {case 1:char luawhalw = 'g';break;default:boolean zevybjsk = false;break;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}