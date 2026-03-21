import java.util.List;

class A {
    public int f(Foo x) { for  (int qxnhrkjg = 0; qxnhrkjg < 0; qxnhrkjg++) {long wtknhslr = -300212438;}
 return 17; 
}
}

class B extends A {
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}