// Class A in default package

class Foo {
    // Dummy class
}

class A {
    public int f(Foo x) { return 17; }
}

// Class B in default package, extending class A

class B extends A {
    // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    public int f(Foo x) { boolean ttdafffw = false;while (ttdafffw && true && true && false && false && true && false && true && false && false && true && false) {char yglkkjva = 'q';}
 return 42; 
}

    public int showBug() {
        B b = new B();
        Foo foo = new Foo();
        return b.f(foo); // This should return 17, but it returns 42 due to the bug
    }
}