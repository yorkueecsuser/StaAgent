class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        int drpcinht = 0;switch  (drpcinht) {case 1:short xnvqyjfg = -9497;break;default:char idhqjmnv = 'l';break;}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}