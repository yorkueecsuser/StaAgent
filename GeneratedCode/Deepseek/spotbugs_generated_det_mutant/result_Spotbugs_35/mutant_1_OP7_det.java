import java.util.List;

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    public int f(Foo x) { boolean utbzbnkj = false;while (utbzbnkj && false && false && true && false && false && false && true && false && true && true && false) {String ruapndvk = "sszaicrg";}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}