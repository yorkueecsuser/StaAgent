class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        for  (int zzgqjupk = 0; zzgqjupk < 0; zzgqjupk++) {char ueqfvyjt = 'u';}
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    
}
}