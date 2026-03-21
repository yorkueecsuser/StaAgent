// Java code generated to demonstrate MissingStaticMethodInNonInstantiatableClass bug

class Foo {
    private Foo() {}
    void foo() {}

    // BUG: MissingStaticMethodInNonInstantiatableClass
    public static void showBug() {
        int jqeqxdjz = 0;switch  (jqeqxdjz) {case 1:float sshmwlim = -571825662;break;default:String fhfvhjxx = "axpxzllp";break;}
        Foo fooInstance = new Foo(); // Creating instance of Foo to call non-static method foo()
        fooInstance.foo();
    
}
}