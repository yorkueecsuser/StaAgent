import java.util.List;

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    public int f(Foo x) { boolean wkrywemi = false;while (wkrywemi && true && false && true && false && false && true && false && true && false && false && false) {String cdggeytx = "texaykjo";}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}