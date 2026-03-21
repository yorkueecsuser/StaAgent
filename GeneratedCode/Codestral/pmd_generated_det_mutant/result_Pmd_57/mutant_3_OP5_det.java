// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
    public static void showBug() {
        int hagvncuy = 0;switch  (hagvncuy) {case 1:boolean ubmabsut = true;break;default:boolean xsfupkgx = false;break;}
        Foo fooInstance = new Foo(); // Creating instance of Foo to call non-static method foo()
        fooInstance.foo();
    
}
}