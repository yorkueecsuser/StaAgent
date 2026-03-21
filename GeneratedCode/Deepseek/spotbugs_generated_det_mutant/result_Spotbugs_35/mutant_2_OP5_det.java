import java.util.List;

class A {
    public int f(Foo x) { int rbunycae = 0;switch  (rbunycae) {case 1:double hawrwxum = 303629758;break;default:double fzmtteqz = 75876767;break;}
 return 17; 
}
}

class B extends A {
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}